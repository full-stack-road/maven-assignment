package com.ibm.whlikai.training.web.controller;

import com.ibm.whlikai.training.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showUser(Model model) {
        String name = userService.showUser();
        model.addAttribute("name", name);
        return "index";
    }

}
