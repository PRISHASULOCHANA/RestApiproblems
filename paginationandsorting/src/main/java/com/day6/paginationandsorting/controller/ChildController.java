package com.day6.paginationandsorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.paginationandsorting.entity.Child;
import com.day6.paginationandsorting.service.ChildService;

@RestController
public class ChildController {
	@Autowired
	private ChildService childservice;
	
	@PostMapping("/add")
	public Child addData(@RequestBody Child child) {
		return childservice.saveData(child);
	}
	
	@PostMapping("/addchildren")
	public ResponseEntity<String> addChild(@RequestBody List<Child> child) {
		return childservice.saveDetails(child);
	}

	
	@GetMapping("/child/{id}")
	public ResponseEntity<Child> getChild(@PathVariable int id) {
		Child child = childservice.getChildren(id);
		if (child == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(child);
	}
	
	@GetMapping("/get")
    public ResponseEntity<Page<Child>> getChildByField(@RequestParam int pageNo, @RequestParam int pageSize,@RequestParam String field) {   
        Page<Child>child = childservice.getChildByField(pageNo,pageSize,field);
        return ResponseEntity.ok(child);
    }
}

