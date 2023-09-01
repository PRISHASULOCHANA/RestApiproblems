package com.day6.paginationandsorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.paginationandsorting.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Integer>{

}
