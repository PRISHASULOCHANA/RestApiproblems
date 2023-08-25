package com.day5.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.crudoperation.models.Book;
import com.day5.crudoperation.service.ApiService;
@RestController
public class Apicontroller {
	
	@Autowired
	public ApiService bookService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getStudent(@PathVariable int id) {
		Book book = bookService.getBook(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	
	
	@PostMapping("/book")
	public ResponseEntity<Integer> addStudent(@RequestBody Book book) {
		int id = bookService.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}
	
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> book = bookService.getAllBooks();
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
		return ResponseEntity.ok("Updated");
	}
	
	
	@DeleteMapping("/book")
	public ResponseEntity<String> deleteStudent(@RequestBody Book book) {
		bookService.deleteBook(book.getId());
		return ResponseEntity.ok("Deleted");
	}

	
	
}

