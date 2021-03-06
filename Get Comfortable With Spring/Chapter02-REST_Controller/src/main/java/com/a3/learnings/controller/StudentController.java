package com.a3.learnings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.a3.learnings.model.Student;

@RestController
@RequestMapping("/")
public class StudentController {
	
	
	@GetMapping("/student") 
	//Always use a verb in the URI
	public List<Student> getListofStudent(){
		
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student(1,"Anubhaw"));
		theStudents.add(new Student(2,"Sinha"));
		
		
	return theStudents;	
	}
	
	//Annotation to read value from the path variable
	
	@GetMapping("/student/{studentId}") 
	//Always use a verb in the URI
	public Student getStudent(@PathVariable(name="studentId") int id){
		
		System.out.println(" Student id in the request Path Variable - "+id);
		
		Student theStudents = new Student(1, "Anubhaw");
		
		
	return theStudents;	
	}
	
	
	
	@GetMapping("/students") 
	//Always use a verb in the URI
	public Student getStudentName(@RequestParam(name="id", required=false) String id){
		
		System.out.println("Student id in the request Param - "+id);
		
		Student theStudents = new Student(1, "Anubhaw", "Sinha");
		
		
	return theStudents;	
	}
	

}
