package com.improveminds.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/home")
    public String home() {
    	return "Hello home";
    }
    @GetMapping("/tree")
    public String tree() {
    	return "Hello tree";
    }
    @PostMapping("/post")
	public String addUser() {
    	        return "User added successfully";
	
	}
}
