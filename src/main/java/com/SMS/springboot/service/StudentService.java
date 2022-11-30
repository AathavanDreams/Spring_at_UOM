package com.SMS.springboot.service;


import com.SMS.springboot.dto.StudentDto;

import java.util.List;

public interface StudentService {

    void saveUser(StudentDto student);

    List<StudentDto> getAllStudents();

}
