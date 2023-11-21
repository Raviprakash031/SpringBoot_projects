package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.FirstController;

@SpringBootApplication
public class SpringBootExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample1Application.class, args);
		FirstController obj=new FirstController();
		obj.firstApi();
		System.out.println(obj);
	}

}
