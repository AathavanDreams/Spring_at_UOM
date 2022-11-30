package com.example.sprintbootdemo.service.impl;

import com.example.sprintbootdemo.dto.Student;
import com.example.sprintbootdemo.entity.StudentEntity;
import com.example.sprintbootdemo.repo.StudentRepo;
import com.example.sprintbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveUser(Student student){

        try {

            StudentEntity studentEntity = new StudentEntity(student.getFirstName(),student.getLastName());
            studentRepo.save(studentEntity);

        } catch (Exception e) {

        }

    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<StudentEntity> getAllStudents(){

        return studentRepo.findAll();
    }

}
