package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
public List<Student> getAllStudents(){
	List<Student> allStudents=studentrepository.findAll();
	
	return allStudents;
}
public String addStudent(Student student) {
	Student student1=studentrepository.save(student);
	if(student1!=null) {
		return "Student added successfully";
	}
	else {
			return "Not added successfully";
		
	}
			
}
public String removeStudent(int id) {
	studentrepository.deleteById(id);
	return "deleted Successfilly";
}
public Optional<Student> getStudentId(int id) {
	Optional<Student> student=studentrepository.findById(id);
	return student;
}
public String updateStudent(int id,Student student) {
	student.setId(id);
	Student student1=studentrepository.save(student);
	if(student1!=null) {
		return "Student updated successfully";
	}
	else {
			return "Not updaated successfully";
		
	}
	
	
}
}
