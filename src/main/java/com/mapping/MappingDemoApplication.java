package com.mapping;

import com.mapping.repository.AddressRepository;
import com.mapping.repository.LaptopRepository;
import com.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SpringBootApplication
public class MappingDemoApplication implements CommandLineRunner {

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// One to Many//
		// Create and save Address records
		// Create and save Student record
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setName("John Doe");
		student1.setAbout("Some information about John Doe");

		Student student2 = new Student();
		student2.setStudentId(2);
		student2.setName("Sahazad Shaikh");
		student2.setAbout("Software Engineer");

// Save the student first
		student1 = studentRepository.save(student1);
		student2 = studentRepository.save(student2);

// Create and save Address records
		Address address1 = new Address(1, "City1", "Country1", "Street1");
		address1.setStudent(student1); // Set the student for address1

		//addressRepository.save(address1);

		Address address2 = new Address(2, "City2", "Country2", "Street2");
		address2.setStudent(student1); // Set the student for address2
		addressRepository.save(address2);

		Address address3 = new Address(3, "City3", "Country3", "Street3");
		address3.setStudent(student2); // Set the student2 for address3
		addressRepository.save(address3);

		Address address4 = new Address(4, "Nashik", "Country4", "Street4");
		address4.setStudent(student2); // Set the student2 for address3
	//	addressRepository.save(address4);

		Address address5 = new Address(5, "City5", "Counry5", "Street5");
		address5.setStudent(student2); // Set the student2 for address3
		//addressRepository.save(address5);


// Now set addresses for the student and update the student
		student1.setAddress(Arrays.asList(address1, address2));
		studentRepository.save(student1);

		student2.setAddress(Arrays.asList(address3, address5, address4));
		studentRepository.save(student2);

		// Fetch and display records
		System.out.println("Addresses:");
		addressRepository.findAll().forEach(System.out::println);

		System.out.println("\nStudents:");
		studentRepository.findAll().forEach(System.out::println);
	}
}


/*
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student();
		student.setName("Shahazad Shaikh");
		student.setAbout("Dont know");
		student.setStudentId(14);

		Laptop laptop=new Laptop();
		laptop.setLaptopId(121);
		laptop.setModelNumber("Dell");
		laptop.setModelNumber("1212");

		//Now
		laptop.setStudent(student);
		student.setLaptop(laptop);

		Student save=studentRepository.save(student);
		System.out.println("Data Stored"+save);

	}
	}

 */
