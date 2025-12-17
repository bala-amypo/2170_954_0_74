package com.example.demo.repository;
import org.springframework.data.jpa.reposite.JpaRepository;
import org.springframework.stereotype.reposite;
import com.example.demo.entity.student;
@Reposite
public interface StudentRepo extends
JpaRepository<Student,Long>{
    
}