package com.dockerdemo.JavaDemo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String welcome() {
		return String.format("Welcome to Java! Greetings by Piyaviraj @ %s!", new Date().getTime());
	}
	
}

