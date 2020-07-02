package com.example.service;

import com.example.demo.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> listAll() {
        return repository.findAll();
    }

    public void save(Student student) {
        repository.save(student);
    }

    public Student get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    public Student getStudentById(Integer studentId) {
        return repository.getStudentById(studentId);
    }

    public void deleteStudent(Integer studentId) {
        repository.deleteStudent(studentId);
    }

    public void addStudent(Student student) {
        repository.addStudent(student.getStudentId(), student.getName(), student.getAge(), student.getNationality(),
                student.getMajor());
    }

    public void updateStudent(Student student) {
        repository.updateStudent(student.getStudentId(), student.getName(), student.getAge(), student.getNationality(),
                student.getMajor());
    }
}
