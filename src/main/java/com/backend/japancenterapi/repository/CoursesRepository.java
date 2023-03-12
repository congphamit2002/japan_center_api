package com.backend.japancenterapi.repository;

import com.backend.japancenterapi.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
    @Query(nativeQuery = true, value = "call customFindAllCourse()")
    public List<Map<String, ?>> customFindAll();
}
