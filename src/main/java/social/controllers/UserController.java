package social.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import social.models.User;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class UserController {
    private static Long id= (long)0;
    ArrayList<User> allUsers = new ArrayList<User>();
    String view = "users";

    @GetMapping("/user")
    public ModelAndView getUserRegistration() {
        HashMap<String, Object> model = new HashMap<>();

//        ============
        User user = new User();
        user.setFirstName("emmanuel");
        user.setLastName("ogbinaka");
        user.setGender("male");
        user.setId(id++);
        allUsers.add(user);
//        ===========

        model.put("allUsers", allUsers);

        return new ModelAndView(view, model);
    }

    @PostMapping("/user")
    public ModelAndView doUserRegistration(@Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) return new ModelAndView(view);
        allUsers.add(user);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/user");

        return new ModelAndView(redirectView);
    }
}
