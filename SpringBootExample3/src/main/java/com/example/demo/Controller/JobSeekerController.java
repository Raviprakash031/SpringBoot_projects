package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.JobSeeker;
import com.example.demo.service.JobSeekerService;

@RestController
public class JobSeekerController {
	@Autowired
	private JobSeekerService jobseekerservice;
	@RequestMapping("/check")
	public String jobseeker() {
		return "This is Job seeker Api";
	}
	//adding Jobseeker details
	@RequestMapping("/addJobseeker")
	public String addingJobSeeker(@RequestBody JobSeeker jobseeker) {
		String result=jobseekerservice.addJobSeeker(jobseeker);
		return result;
	}
	//Getting all user details
		@RequestMapping("/getAllJobSeeker")
		public List<JobSeeker> getAllJobSeekerDetails(){
			List<JobSeeker> jobseekers=jobseekerservice.getAllJobSeeker();
			 return jobseekers;
		}
		//deleting all the details 
		@RequestMapping("/deletejobseeker/{id}")
		public String deleteJobSeekerById(@PathVariable int id){
		String result=jobseekerservice.removeJobSeeker(id);
			return result;
		}
		
		//getting all jobSeker details by id
		@RequestMapping("findAllJobSeeker/{id}")
		public Optional<JobSeeker> getJobSeekerById(@PathVariable int id) {
			Optional<JobSeeker> jobseeker=jobseekerservice.getJobSeekerId(id);
			return jobseeker;
		}
		
		//updating all jobSeeker details 
		@RequestMapping("/updateJobSeekerById/{id}")
		public String updateJobSeekerById(@PathVariable int id,@RequestBody JobSeeker jobseeker) {
			String result=jobseekerservice.updateUser(id,jobseeker);
			return result;
		}

}
