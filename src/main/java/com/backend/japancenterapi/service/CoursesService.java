package com.backend.japancenterapi.service;

import com.backend.japancenterapi.entity.Courses;
import com.backend.japancenterapi.payload.CourseRespone;
import com.backend.japancenterapi.repository.CoursesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CoursesService implements CoursesServiceImp{
    @Autowired
    CoursesRepository coursesRepository;
    @Override
    public List<Map<String, ?>> findAll() {
        return coursesRepository.customFindAll();
    }

    @Override
    public List<Courses> find() {
        return coursesRepository.findAll();
    }
}
