package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Have a great day";
	}

	@GetMapping("/user/books/show")
	public List<String> showBooks() {
		return Arrays.asList("java","jsp");
	}
	
	@GetMapping("/admin/books/in")
	public String addBooks() {
		return "added";
	}
}
