package com.example.service;

import com.example.demo.Major;
import com.example.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MajorService {

    @Autowired
    public MajorRepository repository;

    public List<Major> getAllMajors(){
        return repository.getAllMajors();
    }

    public Major getMajorById(Integer majorId) {
        return repository.getMajorById(majorId);
    }

    public void addMajor(Major major) {
        repository.addMajor(major.getMajorId(), major.getName(), major.getSemesters());
    }

    public void updateMajor(Major major) {
        repository.updateMajor(major.getMajorId(), major.getName(), major.getSemesters());
    }

    public void deleteMajor(Integer majorId) {
        repository.deleteMajor(majorId);
    }

}
