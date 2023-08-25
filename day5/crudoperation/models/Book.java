package com.day5.crudoperation.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
     @Id
     private int id;
     private String bookName;
     private float price;
     private int quantity;
     private String authorName;
     	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
public Book(int id, String bookName, float price, int quantity, String authorName) {

	this.id = id;
	this.bookName = bookName;
	this.price = price;
	this.quantity = quantity;
	this.authorName = authorName;
}
public Book() {
	
}

}

