package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;



@RestController
public class ThirdController {
	@Autowired
	private UserService userservice;
	@RequestMapping("/third")
    public String thirdApi() {
	  return "This id my third spring boot Api";
    }
	//Adding User
	@RequestMapping("/addUser")
	public String AddingUser(@RequestBody User user) {
		String result=userservice.addUser(user);
		return result;
	}
	//Getting all user details
	@RequestMapping("/getAllUsers")
	public List<User> getAllUserDetails(){
		List<User> employees=userservice.getAllUserDetails();
		 return employees;
	}
	@RequestMapping("/deleteUser/{id}")
	public String deleteUserById(@PathVariable int id){
	String result=userservice.removeUser(id);
		return result;
	}
	@RequestMapping("findAllUser/{id}")
	public Optional<User> getEmployeeById(@PathVariable int id) {
		Optional<User> user=userservice.getUserId(id);
		return user;
	}
	@RequestMapping("/updateUserById/{id}")
	public String updateUserById(@PathVariable int id,@RequestBody User user) {
		String result=userservice.updateUser(id,user);
		return result;
	}
}
