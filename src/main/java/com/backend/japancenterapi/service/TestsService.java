package com.backend.japancenterapi.service;

import com.backend.japancenterapi.entity.Test;
import com.backend.japancenterapi.repository.TestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestsService implements TestsServiceImp{
    @Autowired
    TestsRepository testsRepository;
    @Override
    public List<Test> findAll() {
        return testsRepository.findAll();
    }
}
