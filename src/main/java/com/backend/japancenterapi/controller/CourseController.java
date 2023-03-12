package com.backend.japancenterapi.controller;

import com.backend.japancenterapi.entity.Courses;
import com.backend.japancenterapi.payload.CourseRespone;
import com.backend.japancenterapi.service.CoursesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CoursesServiceImp coursesServiceImp;

    @GetMapping("/")
    public ResponseEntity<?> findAllCourse() {
        try {
            return new ResponseEntity<List<Map<String, ?>>>(coursesServiceImp.findAll(), HttpStatus.OK);
        }catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Not found", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> find() {
        try {
            return new ResponseEntity<List<Courses>>(coursesServiceImp.find(), HttpStatus.OK);
        }catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Not found", HttpStatus.BAD_REQUEST);
        }
    }
}
