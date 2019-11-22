package com.mercury.beans;

public class Book implements Comparable<Book> {  // generic : book, it can only compare with  book

	private String isbn;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String isbn, int price) {
		super();
		this.isbn = isbn;
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		Book input = (Book) o;
		//instance of ??? 
		// no check for book; equals: compare 2 values in objects
		//return positive : this > input
//		return 0:this = input
//		return negative : this < input
		return this.price = input.price;
	}
	

}
