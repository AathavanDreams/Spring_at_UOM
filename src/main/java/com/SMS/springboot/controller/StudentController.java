package com.SMS.springboot.controller;

import com.SMS.springboot.dto.StudentDto;
import com.SMS.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/save-student")
    public ModelAndView saveStudent(@ModelAttribute StudentDto studentDto) {
        studentService.saveUser(studentDto);
        return new ModelAndView("redirect:http://localhost:8080/result.html" );
    }

}
