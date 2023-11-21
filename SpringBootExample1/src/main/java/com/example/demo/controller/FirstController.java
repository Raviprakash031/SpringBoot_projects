package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
public class FirstController {
	@Autowired
	private StudentService studentservice;
	@RequestMapping("/first")
	public ResponseEntity<String> firstApi(){
	String str="This is my first api in spring boot";
	return ResponseEntity.ok(str);
	}
	
	@RequestMapping("/allStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		List<Student> students=studentservice.getAllStudents();
		return ResponseEntity.ok(students);
	}
	@RequestMapping("/addStudent")
	public String addingStudent(@RequestBody Student student) {
		String result=studentservice.addStudent(student);
		return result;
	}
	
	@RequestMapping("/deleteStudent/{id}")
	public String deleteStudentById(@PathVariable int id){
	String result=studentservice.removeStudent(id);
		return result;
	}
	@RequestMapping("findAllStudents/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		Optional<Student> student=studentservice.getStudentId(id);
		return student;
	}
	@RequestMapping("/updateStudentById/{id}")
	public String updateStudentById(@PathVariable int id,@RequestBody Student student) {
		String result=studentservice.updateStudent(id,student);
		return result;
	}
	
	
	
}
