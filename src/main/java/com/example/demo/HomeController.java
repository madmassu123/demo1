package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// please pay attention when you change any file
@Controller
    public class HomeController{
    @RequestMapping("/loadForm")
    public String loadFormpages() {
        return "formtemplate";
    }

        @RequestMapping("/processForm")
        public String loadFormPage(@RequestParam("login") String login , Model model)  {
            System.out.println(login);
            model.addAttribute("loginval", login);
            return "confirm";
    }
}
