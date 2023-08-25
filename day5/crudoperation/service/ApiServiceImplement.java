package com.day5.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.crudoperation.models.Book;
import com.day5.crudoperation.repository.BookRepository;

@Service
public class ApiServiceImplement  implements ApiService{

	
@Autowired

private BookRepository bookrepository;

@Override
public Book getBook(int id) {
	Optional<Book> optional=bookrepository.findById(id);
	if(optional.isEmpty()) {
		return null;
	}
	return optional.get();
}


@Override

public int addBook(Book book) {
	Book save=bookrepository.save(book);
	return save.getId();
	}



@Override
public List<Book> getAllBooks(){
	return bookrepository.findAll();
}


@Override
public void updateBook(Book book) {
	bookrepository.save(book);
	
}


@Override
public void deleteBook(int id) {
	Optional<Book> optional = bookrepository.findById(id);
	if(!optional.isEmpty()) {
	  bookrepository.delete(optional.get());
	}
}






}