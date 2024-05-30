package com.courselist.Courselist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Course")
public class Course 
{
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   
   int id;
   String coursename;
   String description;
   
   

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
