package com.example.registerform.controller;

import com.example.registerform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String registerForm(Model model)
    {
        model.addAttribute("user",new User());
        return "register";
    }
    @PostMapping("/register1")
    public String registerUser(@ModelAttribute("user") User user,Model model)
    {
        model.addAttribute("message","User added successfully");
        return "register1";
    }
}
