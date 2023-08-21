package com.day1.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllerex2 {
@GetMapping("/name")
public String getName(@RequestParam String name) {
	return "Welcome "+name+" !";
}
}
