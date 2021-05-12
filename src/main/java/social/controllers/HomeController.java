package social.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import social.models.User;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class HomeController {
    private static int id = 1;

    @RequestMapping("/home")
    public ModelAndView getHomePage(){

        String view = "register";
        HashMap<String, Object>viewModel = new HashMap<>();

        return null;


    }
}
