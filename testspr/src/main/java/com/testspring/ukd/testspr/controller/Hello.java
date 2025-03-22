package com.testspring.ukd.testspr.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String indexPage() {
        return "<h2>Hello World</>";
    }

}
