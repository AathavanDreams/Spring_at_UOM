package com.example.sprintbootdemo.service.impl;

import com.example.sprintbootdemo.dto.Student;
import com.example.sprintbootdemo.entity.StudentEntity;
import com.example.sprintbootdemo.repo.StudentRepo;
import com.example.sprintbootdemo.service.StudentService;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveUser(Student student) {

        try {

            StudentEntity studentEntity = new StudentEntity(student.getFirstName(), student.getLastName());
            studentRepo.save(studentEntity);

        } catch (Exception e) {

        }

    }


    @Override
    public List<StudentEntity> getAllStudents() {
//        return studentRepo.findAll().stream().map(student -> modelMapper.map(student, Student.class)).collect(Collectors.toList());
        return studentRepo.findAll();
    }
}
