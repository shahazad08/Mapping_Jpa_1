//package com.mapping.controller;
//
//import com.mapping.Student;
//import com.mapping.repository.LaptopRepository;
//import com.mapping.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    @Autowired
//    LaptopRepository laptopRepository;
//
//    @PostMapping("/create")
//    public void create(@RequestBody Student student) {
//        Student s=studentRepository.save(student);
//        System.out.println("create User"+s);
//    }
//}
