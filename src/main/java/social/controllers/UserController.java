package social.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import social.models.User;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class UserController {
    private static int id = 1;
    ArrayList<User> allUsers = new ArrayList<User>();
    String view = "users";

    @GetMapping("/user")
    public ModelAndView getUserRegistration() {
        HashMap<String, Object> model = new HashMap<>();

//        ============
        allUsers.add(new User("ogbinaka", "emmanuel", "male", id++));
//        ===========

        model.put("allUsers", allUsers);

        return new ModelAndView(view, model);
    }

    @PostMapping("/user")
    public ModelAndView doUserRegistration(User user) {
        allUsers.add(user);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/user");

        return new ModelAndView(redirectView);
    }
}
