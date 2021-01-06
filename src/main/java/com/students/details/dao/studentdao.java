package com.students.details.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.students.details.entites.Student;

@Repository

public interface studentdao extends CrudRepository<Student,Long> {

	Student save(int marks);

}
