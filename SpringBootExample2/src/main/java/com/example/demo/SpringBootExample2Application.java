package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controller.SecondController;

@SpringBootApplication
public class SpringBootExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample2Application.class, args);
		SecondController second=new SecondController();
		System.out.println(second.secondApi());
	}

}
