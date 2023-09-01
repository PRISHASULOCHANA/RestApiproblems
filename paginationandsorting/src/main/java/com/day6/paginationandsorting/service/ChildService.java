package com.day6.paginationandsorting.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.day6.paginationandsorting.entity.Child;

public interface ChildService {

	Child saveData(Child child);

	ResponseEntity<String> saveDetails(List<Child> child);

	Child getChildren(int id);

	Page<Child> getChildByField(int pageNo, int pageSize, String field);

	
}
