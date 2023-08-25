package com.day5.crudoperation.service;

import java.util.List;

import com.day5.crudoperation.models.Book;

public interface ApiService {

	Book getBook(int id);

	int addBook(Book book);

	List<Book> getAllBooks();

	void updateBook(Book book);

	void deleteBook(int id);
	
}