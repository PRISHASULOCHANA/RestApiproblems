package com.day6.paginationandsorting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.day6.paginationandsorting.entity.Child;
import com.day6.paginationandsorting.repository.ChildRepository;

@Service
public class ChildServiceImplement implements ChildService{
@Autowired
	private ChildRepository childrepository;
		
		@Override
		public Child saveData(Child child) {
			return childrepository.save(child);
		}
		
		@Override
		public ResponseEntity<String> saveDetails(List<Child> child) {
		    childrepository.saveAll(child);
		    return ResponseEntity.ok("data added");
			 
		}
		
		
		@Override
		public Child getChildren(int id) {
			Optional<Child > optional=childrepository.findById(id);
			if(optional.isEmpty()) {
				return null;
			}
			return optional.get();
		}
		@Override
		 public Page<Child> getChildByField(int pageNo, int pageSize,String field) {
			Sort sort= Sort.by(field);
		        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		        return childrepository.findAll(pageable);
		    }

	}

