package com.day1.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3 {
	@Value("1")
	public int id;
	@Value("Prisha")
	public String name;
	@Value("19")
	public int age;
	@Value("30000")
	public long salary;
	@GetMapping("/day")
	public String day()
	{
		return id+"-"+name+"-"+age+"-"+salary;
	}
	}

