package com.students.details.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.details.entites.Student;
import com.students.details.manager.studentmanager;

@RestController
public class apiGateway {
	 
	
	private studentmanager studentManager;
	@PostMapping("/list")
	public List<Student> getStudent(){
		 
		List<Student> student = studentManager.getStudents();
		return student;
	 }
	@PostMapping("/list/create")
	public Student createStudent(@RequestBody Student student) {
		return student = studentManager.createStudent(student);
	}
	@PutMapping("/list/create/update/")
	public String updateStudent(@RequestBody Student students) {
		
		String student =studentManager.updateStudent(students);
		return student;
	}
	@PutMapping("/list/create/update/{marks}")
	public int updateMarks(@RequestBody @PathVariable("marks") int studentid,int marks) {
		 marks = studentManager.updateMarks(studentid, marks);
		return marks;
	}
	@DeleteMapping("/list/create/update/delete")
	public String deleteStudent(Long studentid) {
		return studentManager.deleteStudent(studentid);
	}
	

}
