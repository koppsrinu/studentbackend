package com.students.details.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.students.details.dao.studentdao;
import com.students.details.entites.Student;

@Service
public class studentmanager {
	
	private studentdao studentDao;
	
	public List<Student> getStudents(){
		List<Student> students = (List<Student>) studentDao.findAll();
		return students;
	}
    
	public Student createStudent(Student students) {
		
		Student student = studentDao.save(students);
		return student;
		
	}
	public String updateStudent(Student students) {
		if(students!=null && students.getId()!=0) {
			Optional<Student> optionalstudent = studentDao.findById((long) students.getId());
			if(optionalstudent!=null && optionalstudent.isPresent()) {
				Student student = optionalstudent.get();
				if(student!=null && student.getName().isEmpty()) {
					student.setName(students.getName());
				 }
				Student updateStudent = studentDao.save(students);
				if(updateStudent!=null) {
					return "updated name";
				}else
				{
					return "not updated";
				}
				}else {
					return "not updated";
				}
			}
		return null;
		
		
 	}
   public int updateMarks(int studentid, int marks) {
	   if(studentid!=0 && marks!=0) {
		    Optional<Student> optionalstudent = studentDao.findById((long) (studentid));
		    if(optionalstudent!=null && optionalstudent.isPresent()) {
		    	Student students = optionalstudent.get();
		    	  if(marks!=0) {
		    		  students.setMarks(marks);
		    		 Student updateMarks = studentDao.save(marks); 
		    		 if(updateMarks!=null) {
		    			 return marks;
		    		 }else {
		    			 return marks;
		    		 }
		    	  }
		    		  
		    }
	   }
	   
	return marks;
	   
   }
   
   public String deleteStudent(Long studentid) {
	   if(studentid!=0) {
		   Optional<Student> optionalstudent = studentDao.findById(studentid);
		 if(optionalstudent!=null && optionalstudent.isPresent()) {
			 Student student = optionalstudent.get();
			 if(student!=null) {
				 studentDao.deleteAll();
				 return "user deleteed";
			 }else {
				 return "user not deleted";
			 }
		 }else
		 {
			 return "user not deleted";
		 }
	   }
		   
	return null;
	   
   }
}
