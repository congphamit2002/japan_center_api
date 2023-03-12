package com.backend.japancenterapi.service;

import com.backend.japancenterapi.entity.Courses;
import com.backend.japancenterapi.payload.CourseRespone;

import java.util.List;
import java.util.Map;

public interface CoursesServiceImp {
    public List<Map<String, ?>> findAll();
    public List<Courses> find();
}
