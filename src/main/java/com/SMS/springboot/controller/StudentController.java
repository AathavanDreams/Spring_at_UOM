package com.SMS.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/save-student")
    public String saveStudent() {
        return "Let's save student details.";
    }

}
