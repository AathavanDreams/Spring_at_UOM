package com.SMS.springboot.service.impl;

import com.SMS.springboot.dto.StudentDto;
import com.SMS.springboot.entity.StudentEntity;
import com.SMS.springboot.repo.StudentRepo;
import com.SMS.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveUser(StudentDto student){

        try {

            StudentEntity studentEntity = new StudentEntity(student.getFirstName(),student.getLastName());
            studentRepo.save(studentEntity);

        } catch (Exception e) {

        }

    }



}