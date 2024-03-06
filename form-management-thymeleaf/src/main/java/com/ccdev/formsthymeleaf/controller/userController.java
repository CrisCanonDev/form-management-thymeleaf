package com.ccdev.formsthymeleaf.controller;

import com.ccdev.formsthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class userController {

    @GetMapping("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        List<String> professions = Arrays.asList("Developer", "Handyman", "Nurse", "Entrepreneur");
        model.addAttribute("professions", professions);

        return "register-form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user){
        System.out.println(user.toString());
        return "register-success";
    }
}
