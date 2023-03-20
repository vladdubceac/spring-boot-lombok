package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		Student student = new Student();
		student.setFirstName("Vlad");
		student.setLastName("Dubceac");
		System.out.println("Hello, "+student);
	}

}
