package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.constructor.Student;
import com.spring.setter.Employee;

@SpringBootApplication(scanBasePackages = {"com.spring","com.example"})
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	@Autowired
	Employee employee;
	@Autowired
	Student student;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(employee);
		
	
	
	System.out.println(student);
}
}
