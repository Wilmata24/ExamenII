package com.example.controller;

import com.example.demo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list() {
        return  service.listAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student student = service.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public void add(Student student) {
        service.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable Integer id) {
        try {
            Student existingStudent = service.get(id);
            service.save(existingStudent);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(@RequestParam(value = "studentId") Integer studentId) {
        return service.getStudentById(studentId);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam(value = "studentId") Integer studentId) {
        service.deleteStudent(studentId);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
    }
}
