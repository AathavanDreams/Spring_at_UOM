package com.SMS.springboot.controller;

import com.SMS.springboot.dto.StudentDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/save-student")
    public String saveStudent(@ModelAttribute StudentDto studentDto) {
        String name = "Student Name: "+studentDto.getFirstName()+" "+studentDto.getLastName();
        return name;
    }

}
