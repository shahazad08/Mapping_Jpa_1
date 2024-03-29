package com.mapping;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_address")
public class Address {
    @Id
    private int address_id;
    private String city;
    private String country;
    private String street;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Address(int address_id, String city, String country, String street, Student student) {
        this.address_id = address_id;
        this.city = city;
        this.country = country;
        this.street = street;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address(int address_id, String city, String country, String street) {
        this.address_id = address_id;
        this.city = city;
        this.country = country;
        this.street = street;
    }

    public Address() {

    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", student=" + student +
                '}';
    }
}
