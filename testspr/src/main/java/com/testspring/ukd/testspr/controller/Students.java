package com.testspring.ukd.testspr.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.testspring.ukd.testspr.service.StudentService;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

@Controller
public class Students {

    private final StudentService studentService = new StudentService();

    @GetMapping("/students/")
    public String indexPage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}