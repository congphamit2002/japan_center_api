package com.backend.japancenterapi.controller;

import com.backend.japancenterapi.entity.Test;
import com.backend.japancenterapi.service.TestsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestsController {
    @Autowired
    TestsServiceImp testsServiceImp;
    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        try {
            return new ResponseEntity<List<Test>>(testsServiceImp.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Not Found", HttpStatus.BAD_REQUEST);
        }
    }

}
