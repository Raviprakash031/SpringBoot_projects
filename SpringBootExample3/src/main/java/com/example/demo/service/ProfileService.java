package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepository;



@Service
public class ProfileService {
	@Autowired
	private ProfileRepository profilerepo;
	
	//Adding Profile details
	public String addProfile(Profile profile) {
		Profile profile1=profilerepo.save(profile);
		if(profile1!=null) {
			return "Profile added successfully";
		}
		else
		return "Something wentwrong";
	}
	
	//getting all profile details
	public List<Profile> getAllProfileDetails(){
		List<Profile> profile1=profilerepo.findAll();
		return profile1;
	}
	
	//getting all profile details By id 
	public Optional<Profile> getProfileById(int ProfileId){
		Optional<Profile> profile=profilerepo.findById(ProfileId);
		return profile;
	}
	
	//removing profile details By Id 
	public String removeProfile(int ProfileId) {
		profilerepo.deleteById(ProfileId);
		return "deleted successfully";
	}
	
	//Updating profile details By id
	public String updateProfileById(int ProfileId,Profile profile) {
		profile.setProfileId(ProfileId);
		Profile profile1=profilerepo.save(profile);
		if(profile1!=null) {
			return "Succesfully updated";
		}
		else
			return "No updated";
	}

}
