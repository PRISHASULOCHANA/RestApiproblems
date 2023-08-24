package com.day4.putdelete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.putdelete.models.Student;
import com.day4.putdelete.service.Studentservice;

@RestController
public class Apicontroller {
	@Autowired
	Studentservice studentService ;
	
	@PostMapping("/postStudent")
	public Student post(@RequestBody Student student)
	{
		return studentService.create(student);
	}
	@PutMapping("/updateStudent")
	public Student update(@RequestBody  Student student )
	{
	return studentService.update(student);
	}
	@DeleteMapping("delete/{id}")
	public String del(@PathVariable int id)
	{
		studentService.delete(id);
		return "deleted";
	}
	
}