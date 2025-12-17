package com.example.demo.service;
import java.utli.List;
import com.example.demo.entity.StudentEntity;
public interface StudentEntity{
    StudentEntity addStudent(StudentEntity student);
    list<StudentEntity>getAllStudent();
    StudentEntity getStudentById(Long id);
    StudentEntity updateStudent(Long id,StudentEntity strudent);
}