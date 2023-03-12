package com.backend.japancenterapi.repository;

import com.backend.japancenterapi.entity.User_Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCourseRepository extends JpaRepository<User_Course, Integer> {
}
