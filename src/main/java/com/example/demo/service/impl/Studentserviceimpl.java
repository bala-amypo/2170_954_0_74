package com.example.demo.service.impl;
import java.util.*;
import org.springframework.sterotype.service;
import com.example.demo.entity.student;
@service
public class StudentServiceEmpl implements  studentService{
    private final Map<Long,Student>store=new HashMap<>();
    private Long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setId(count)
    }
}