package com.day5.crudoperation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.crudoperation.models.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
}

	


