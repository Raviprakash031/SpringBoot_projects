package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profile;
import com.example.demo.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileservice;
	@RequestMapping("/check1")
	public String profileCheck() {
		return "This is my Profile Api";
	}
	
	//Adding Profile Details
	@RequestMapping("/addProfile")
	public String addingProfile(@RequestBody Profile profile){
		String result=profileservice.addProfile(profile);
		return result;
	}
	
	//Getting all profile details
	@RequestMapping("/getAllProfile")
	public List<Profile> getAllProfile(){
		List<Profile> profile1=profileservice.getAllProfileDetails();
		return profile1;
	}
	
	//Getting all profile details bY id 
	@RequestMapping("/getProfileById/{ProfileId}")
	public Optional<Profile> getProfileDetailsById(@PathVariable int ProfileId){
		Optional<Profile> profile=profileservice.getProfileById(ProfileId);
		return profile;
	}
	
	//Delete profile details By id
	@RequestMapping("/deleteProfile/{ProfileId}")
	public String deleteProfileById(@PathVariable int ProfileId) {
		String result=profileservice.removeProfile(ProfileId);
		return result;
	}
	
	//Update profile details By Id
	@RequestMapping("/updateProfileById/{ProfileId}")
	public String updateProfileById(@PathVariable int ProfileId,@RequestBody Profile profile) {
		String result=profileservice.updateProfileById(ProfileId, profile);
		return result;
	}
}
