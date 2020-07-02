package com.example.repository;

import com.example.demo.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorRepository extends JpaRepository<Major, Integer> {

    @Query(value = "SelectMajor", nativeQuery = true)
    List<Major> getAllMajors();


    @Query(value = "{call SelectMajorById(:MajorId)}", nativeQuery = true)
    Major getMajorById(@Param("MajorId") Integer majorId);

    @Modifying
    @Query(value = "{ call InsertUpdateMajor(:MajorId, :Name, :Semesters, 'Insert')}", nativeQuery = true)
    void addMajor(@Param("MajorId") Integer majorId, @Param("Name") String name, @Param("Semesters") Integer semesters);

    @Modifying
    @Query(value = "{ call InsertUpdateMajor(:MajorId, :Name, :Semesters, 'Update')}", nativeQuery = true)
    void updateMajor(@Param("MajorId") Integer majorId, @Param("Name") String name, @Param("Semesters") Integer semesters);

    @Modifying
    @Query(value = "{ call DeleteMajor(:MajorId)}", nativeQuery = true)
    void deleteMajor(@Param("MajorId") Integer majorId);


}
