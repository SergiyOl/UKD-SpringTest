package com.testspring.ukd.testspr.controller;

// import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;;

@Controller
public class Message {

    @GetMapping("/message")
    public String indexPage(Model model) {
        model.addAttribute("something", "from message controller");
        return "message";
    }

}