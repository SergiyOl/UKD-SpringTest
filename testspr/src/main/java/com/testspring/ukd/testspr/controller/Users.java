package com.testspring.ukd.testspr.controller;

// import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Arrays;

import org.springframework.stereotype.Controller;;

@Controller
public class Users {

    @GetMapping("/users")
    public String indexPage(Model model) {
        model.addAttribute("users", Arrays.asList(
                new User(0, "Serhii", "myemail@gmail.com"),
                new User(1, "John", "hisemail@gmail.com"),
                new User(2, "Kate", "heremail@gmail.com")

        ));
        return "users";
    }

}