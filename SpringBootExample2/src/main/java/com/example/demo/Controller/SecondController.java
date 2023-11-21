package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;
import com.example.demo.model.Student;

@RestController
public class SecondController {
	@Autowired
	private EmployeeService employeeservice;
@RequestMapping("/second")
public String secondApi() {
	return "This is second Api in String Boot";
}
@RequestMapping("/allEmployeeDetails")

public List<Employee> getAllEmployeeDetails(){
List<Employee> employees=employeeservice.getAllEmployeeDetails();
return employees;
}
@RequestMapping("/addEmployee")
public String addingEmployee(@RequestBody Employee employee) {
	String result=employeeservice.addEmployee(employee);
	return result;
}

@RequestMapping("/deleteemployee/{empid}")
public String deleteEmployeeById(@PathVariable int empid){
String result=employeeservice.removeEmployee(empid);
	return result;
}
@RequestMapping("findAllEmployee/{empid}")
public Optional<Employee> getEmployeeById(@PathVariable int empid) {
	Optional<Employee> employee=employeeservice.getEmployeeId(empid);
	return employee;
}
@RequestMapping("/updateEmployeeById/{empid}")
public String updateEmployeeById(@PathVariable int empid,@RequestBody Employee employee) {
	String result=employeeservice.updateEmployee(empid,employee);
	return result;
}
}
