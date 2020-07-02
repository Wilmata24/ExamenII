package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "Major")
public class Major {

    private int majorId;
    private String name;
    private int semesters;

    public Major() {
    }

    public Major(int majorId, String name, int semesters) {
        this.majorId = majorId;
        this.name = name;
        this.semesters = semesters;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemesters() {
        return semesters;
    }

    public void setSemesters(int semesters) {
        this.semesters = semesters;
    }
}
