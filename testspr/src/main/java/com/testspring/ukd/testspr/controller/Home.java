package com.testspring.ukd.testspr.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Home {

    @GetMapping("/index")
    public String indexPage() {
        return "<h2>Home Page</>";
    }

}
