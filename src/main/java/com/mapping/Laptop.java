package com.mapping;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa-laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;



//    public Laptop(int laptopId, String modelNumber, String brand) {
//        this.laptopId = laptopId;
//        this.modelNumber = modelNumber;
//        this.brand = brand;
//    }


    public Laptop(int laptopId, String modelNumber, String brand, Student student) {
        this.laptopId = laptopId;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop() {
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", modelNumber='" + modelNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", student=" + student +
                '}';
    }
}
