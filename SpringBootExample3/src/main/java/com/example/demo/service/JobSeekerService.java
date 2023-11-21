package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.JobSeeker;
import com.example.demo.repository.JobSeekerRepository;

@Service
public class JobSeekerService {
	@Autowired
	private JobSeekerRepository jobseekerRepo;
	
	public String addJobSeeker(JobSeeker jobseeker){
		JobSeeker js=jobseekerRepo.save(jobseeker);
		if(js!=null) {
			return "Added Succesfully";
		}
		return null;
	}
	public List<JobSeeker> getAllJobSeeker(){
		List<JobSeeker> allJobSeeker=jobseekerRepo.findAll();
		
		
		return allJobSeeker;
		
	}
   public String removeJobSeeker(int id) {
	   jobseekerRepo.deleteById(id);
		return "deleted Successfilly";
	}
	public Optional<JobSeeker> getJobSeekerId(int id) {
		Optional<JobSeeker> jobSeeker=jobseekerRepo.findById(id);
		return jobSeeker;
	}
	public String updateUser(int id,JobSeeker jobseeker) {
		jobseeker.setId(id);
		JobSeeker js=jobseekerRepo.save(jobseeker);
		if(js!=null) {
			return "JobSeeker updated successfully";
		}
		else {
				return "Not updaated successfully";
			
		}
		
		
	}
	public String updateUserById(int id,String name){
		
		return null;
	}

}
