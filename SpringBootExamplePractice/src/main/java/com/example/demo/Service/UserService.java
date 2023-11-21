package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

import com.example.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
   private UserRepository userRepo ;

   public String addUser(User user) {
	   User user1=userRepo.save(user);
	   if(user!=null) {
		   return "User added successfully";
	   }
	   else {
		  return "Something went wrong";
	   }
   }
   public List<User> getAllUserDetails(){
		List<User> allEmployeeDetails=userRepo.findAll();
		
		
		return allEmployeeDetails;
		
	}
   public String removeUser(int id) {
		userRepo.deleteById(id);
		return "deleted Successfilly";
	}
	public Optional<User> getUserId(int id) {
		Optional<User> user=userRepo.findById(id);
		return user;
	}
	public String updateUser(int id,User user) {
		user.setId(id);
		User user1=userRepo.save(user);
		if(user1!=null) {
			return "Employee updated successfully";
		}
		else {
				return "Not updaated successfully";
			
		}
		
		
	}
	public String updateUserById(int id,String name){
		
		return null;
	}

}
