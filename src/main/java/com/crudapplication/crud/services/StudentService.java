package com.crudapplication.crud.services;

import java.util.List;

import com.crudapplication.crud.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Student> getStudents();
	public Student getStudent(long sid);
	public Student updateStudent(Student student);
	public Student deleteStudent(long sid);
}
