package com.crudapplication.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.crud.model.Student;

public interface StudentDao extends JpaRepository<Student,Long>{

}
