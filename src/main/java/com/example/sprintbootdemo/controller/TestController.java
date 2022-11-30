package com.example.sprintbootdemo.controller;

import com.example.sprintbootdemo.dto.Student;
import com.example.sprintbootdemo.entity.StudentEntity;
import com.example.sprintbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public ModelAndView testMethod(@ModelAttribute Student student) {
        studentService.saveUser(student);
        return new ModelAndView("redirect:http://localhost:8080/test.html" );
    }

    @RequestMapping("/show-students")
    public String getAllStudents() {
        List<StudentEntity> test = studentService.getAllStudents();

        String st_list = "";
        for (StudentEntity st : test){
            st_list += "<tr>\n" +
                    "    <td>"+st.getFirstName()+"</td>\n" +
                    "    <td>"+st.getLastName()+"</td>\n" +
                    "  </tr>";
        }
//        return st_list;

//        ModelAndView modelAndView = new ModelAndView("redirect:http://localhost:8080/students.html" );
//        modelAndView.addObject("students",test);

        return "<html>\n" +
                "<head>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <thead>\n" +
                "    <tr>\n" +
                "        <th>Student ID</th>\n" +
                "        <th>Student Name</th>\n" +
                "    </tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" + st_list +
                "    </tbody>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>";
    }
}
