package com.day4.putdelete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.putdelete.models.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}




