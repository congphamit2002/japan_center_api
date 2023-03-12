package com.backend.japancenterapi.controller;

import com.backend.japancenterapi.entity.Teacher;
import com.backend.japancenterapi.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<List<Teacher>>(teacherRepository.findAll(), HttpStatus.OK);
    }
}
