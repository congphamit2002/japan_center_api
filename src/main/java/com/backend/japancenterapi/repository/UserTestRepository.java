package com.backend.japancenterapi.repository;

import com.backend.japancenterapi.entity.User_Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTestRepository extends JpaRepository<User_Test, Integer> {
}
