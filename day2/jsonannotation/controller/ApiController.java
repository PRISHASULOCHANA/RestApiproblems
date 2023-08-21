package com.day2.jsonannotation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${var}")
	
	  String name;
		@GetMapping("name")
		public String display()
		{
		   return "Hi Everyone ,I am "+ name; 
	    }
}
