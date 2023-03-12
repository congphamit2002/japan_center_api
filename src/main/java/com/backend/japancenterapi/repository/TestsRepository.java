package com.backend.japancenterapi.repository;

import com.backend.japancenterapi.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestsRepository extends JpaRepository<Test, Integer> {
}
