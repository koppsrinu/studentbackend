package com.students.details.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*import org.hibernate.annotations.Entity;*/

/*import org.hibernate.annotations.Entity;*/

@Entity

@Table(name = "Student")

public class Student {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	private String Name;
	private int Marks;
}
