package com.crudapplication.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.crud.model.Student;
import com.crudapplication.crud.services.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
		
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
		
	}
	
	@GetMapping("/students/{sid}")
	public Student getStudent(@PathVariable String sid) {
		return this.studentService.getStudent(Long.parseLong(sid));
		
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{sid}")
	public Student deleteStudent(@PathVariable String sid) {
		return this.studentService.deleteStudent(Long.parseLong(sid));
		
	}
}
