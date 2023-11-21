package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controller.ThirdController;

@SpringBootApplication
public class SpringBootExamplePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExamplePracticeApplication.class, args);
		ThirdController third=new ThirdController();
		System.out.println(third.thirdApi());
	}

}
