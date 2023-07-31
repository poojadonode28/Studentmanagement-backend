package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.StudentDao;
import com.crudapplication.crud.model.Student;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
		
		
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(long sid) {
		return studentDao.findById(sid).get();
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student deleteStudent(long sid) {
		Student student=studentDao.findById(sid).get();
		studentDao.delete(student);
		return student;
	}
	
	

}
