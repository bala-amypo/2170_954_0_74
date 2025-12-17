package com.example.demo.controller;

import java.util.List;

import org.springframework.beens.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.services.Studentservice;

@Restcontroller;
@ResquestMapping("/student")
public class Studentcontroller{
    @Autowired
    private Studentservice service;

    @PostMapping('/add')
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        return service.addStudent(student);
    }
    @GetMapping("/all")
    public List<StudentEntity> getAllStudents(){
        return service.getAllStudents();
    }
    @GetMapping("/id")
        public StudentEntity getStudentId(@PathVariable Long id){
            return service.getStudentId(id);
        }

    
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(
        @PathVariable Long id;
        @RequestBody StudentEntity student
    ){
        return service.updateStudent(id,student);        
    }
}