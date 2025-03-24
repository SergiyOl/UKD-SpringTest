package com.testspring.ukd.testspr.controller;

// import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.testspring.ukd.testspr.service.UserService;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;;

@Controller
public class Users {

    private final UserService userService = new UserService();

    @GetMapping("/users")
    public String indexPage(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

}