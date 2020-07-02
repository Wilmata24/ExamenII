package com.example.repository;

import com.example.demo.Student;
import org.hibernate.annotations.OnDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SelectStudent", nativeQuery = true)
    List<Student> getAllStudents();

    @Query(value = "{call SelectStudentById(:StudentId)}", nativeQuery = true)
    Student getStudentById(@Param("StudentId") Integer studentId);

    @Modifying
    @Query(value = "{ call DeleteStudent(:StudentId)}", nativeQuery = true)
    void deleteStudent(@Param("StudentId") Integer studentId);

    @Modifying
    @Query(value = "{ call InsertUpdateStudent(:StudentId, :Name, :Age, :Nationality, :Major, 'Insert')}", nativeQuery = true)
    void addStudent(@Param("StudentId") Integer studentId, @Param("Name") String name, @Param("Age") Integer age,
                    @Param("Nationality") String nationality, @Param("Major") String major);

    @Modifying
    @Query(value = "{ call InsertUpdateStudent(:StudentId, :Name, :Age, :Nationality, :Major, 'Update')}", nativeQuery = true)
    void updateStudent(@Param("StudentId") Integer studentId, @Param("Name") String name, @Param("Age") Integer age,
                    @Param("Nationality") String nationality, @Param("Major") String major);

}
