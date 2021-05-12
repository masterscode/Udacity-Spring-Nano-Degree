package social.auth;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import social.models.User;

import java.util.HashMap;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String getRegister(Model model){

     model.addAttribute("User", new User());
//        return new ModelAndView("register", new User());
        return "register";
    }
}
