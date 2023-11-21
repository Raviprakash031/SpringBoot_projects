package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Student;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepo;
public List<Employee> getAllEmployeeDetails(){
	List<Employee> allEmployeeDetails=employeerepo.findAll();
	
	
	return allEmployeeDetails;
	
}
public String addEmployee(Employee employee) {
	Employee employee1=employeerepo.save(employee);
	if(employee1!=null) {
		return "employee added successfully";
	}
	else {
			return "something went wrong";
		
	}
			
}
public String removeEmployee(int empid) {
	employeerepo.deleteById(empid);
	return "deleted Successfilly";
}
public Optional<Employee> getEmployeeId(int empid) {
	Optional<Employee> employee=employeerepo.findById(empid);
	return employee;
}
public String updateEmployee(int empid,Employee employee) {
	employee.setEmpId(empid);
	Employee employee1=employeerepo.save(employee);
	if(employee1!=null) {
		return "Employee updated successfully";
	}
	else {
			return "Not updaated successfully";
		
	}
	
	
}
}
