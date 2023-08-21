package com.day1.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllerex3 {
	
	@GetMapping("/colour")
 public String getMyFav()
 {
	 String c="black";
	 return "My favourite color is "+c;
 }
}
