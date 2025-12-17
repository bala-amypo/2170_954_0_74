package com.example.demo.controller;

import java.util.List;

import org.springframework.beens.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.services.Studentservice;

@Restcontroller;
@ResquestMapping("/student")
public class