package com.backend.japancenterapi.repository;

import com.backend.japancenterapi.entity.Problem_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemTypeRepository extends JpaRepository<Problem_Type, Integer> {
}
