package com.mapping;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa-student")
public class Student {
    @Id
    private int studentId;
    private String name;
    private String about;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> address;

    public Student(int studentId, String name, String about, List<Address> address) {
        this.studentId = studentId;
        this.name = name;
        this.about = about;
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

//    public Student(int studentId, String name, String about, Laptop laptop) {
//        this.studentId = studentId;
//        this.name = name;
//        this.about = about;
//        this.laptop = laptop;
//    }

    @OneToOne(mappedBy = "student",cascade= CascadeType.ALL)
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}

