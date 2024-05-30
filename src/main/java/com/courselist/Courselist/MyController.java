package com.courselist.Courselist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
  @Autowired
  CourseRepository c;
  
  @RequestMapping("/test")
  public String test()
  {
	  return "Testing successfully completed";
  }
  
  @RequestMapping("/save")
  public String saveall(@RequestBody Course t)
  {
	 c.save(t); 
	 return "Data saved into the database";
  }
  
  @RequestMapping("/all")
  public List<Course> courses()
  {
	  return c.findAll();
  }
  
  
}
