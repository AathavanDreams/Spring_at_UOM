package com.example.sprintbootdemo.repo;

import com.example.sprintbootdemo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
}
