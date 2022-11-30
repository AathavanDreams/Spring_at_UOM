package com.example.sprintbootdemo.service;

import com.example.sprintbootdemo.dto.Student;
import com.example.sprintbootdemo.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    void saveUser(Student student);

    List<StudentEntity> getAllStudents();
}
