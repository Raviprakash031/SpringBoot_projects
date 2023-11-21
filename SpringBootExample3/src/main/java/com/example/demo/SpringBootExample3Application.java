package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controller.JobSeekerController;
import com.example.demo.Controller.ProfileController;

@SpringBootApplication
public class SpringBootExample3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample3Application.class, args);
		JobSeekerController js=new JobSeekerController();
		System.out.println(js.jobseeker());
		ProfileController p=new ProfileController();
		System.out.println(p.profileCheck());
	}

}
