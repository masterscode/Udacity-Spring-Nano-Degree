package social.auth;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import social.models.User;

import java.util.HashMap;

@Controller
public class RegistrationController {
    private final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping("/register")
    public String getRegister(Model model){
    logger.info("made a request to this endpoint-->");
     model.addAttribute("User", new User());
//        return new ModelAndView("register", new User());
        return "register";
    }
}
