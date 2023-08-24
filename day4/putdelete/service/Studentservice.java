package com.day4.putdelete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.putdelete.models.Student;
import com.day4.putdelete.repositories.Studentrepo;


@Service	
public class Studentservice {
	@Autowired
	Studentrepo StudentRepo;
	public Student update(Student student)
	{
		return StudentRepo.save(student);
	
	}
	public void delete(int id)
	{
		StudentRepo.deleteById(id);
	}
	public void deleteInfo(Student student)
	{
		StudentRepo.delete(student);
	}
	public Student create(Student student)
	{
		return StudentRepo.save(student);
	}

}