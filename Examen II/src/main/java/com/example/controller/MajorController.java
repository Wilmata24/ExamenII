package com.example.controller;

import com.example.demo.Major;
import com.example.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin
public class MajorController {
    String errorMessage = "Error de SQL.";
    @Autowired
    private MajorService service;

    @GetMapping("/getAllMajors")
    public List<Major> getAllMajors() throws SQLException {
        try {
            return service.getAllMajors();
        } catch (Exception sqlException){
            throw new SQLException(errorMessage);
        }
    }

    @GetMapping("/getMajorById")
    public Major getMajorById(@RequestParam(value = "majorId") Integer majorId) throws SQLException {
        try {
        return service.getMajorById(majorId);
        } catch (Exception sqlException){
            throw new SQLException(errorMessage);
        }
    }

    @PostMapping("/addMajor")
    public void addMajor(@RequestBody Major major) throws SQLException {
        try {
        service.addMajor(major);
        } catch (Exception sqlException){
            throw new SQLException(errorMessage);
        }
    }

    @PutMapping("/updateMajor")
    public void updateMajor(@RequestBody Major major) throws SQLException {
        try {
        service.updateMajor(major);
        } catch (Exception sqlException){
            throw new SQLException(errorMessage);
        }
    }

    @DeleteMapping("/deleteMajor")
    public void deleteMajor(@RequestParam(value = "majorId") Integer majorId) throws SQLException {
        try {
            service.deleteMajor(majorId);
        } catch (Exception sqlException){
            throw new SQLException(errorMessage);
        }
    }


}
