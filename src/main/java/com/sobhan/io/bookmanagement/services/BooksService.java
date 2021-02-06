package com.sobhan.io.bookmanagement.services;

import java.util.List;

import com.sobhan.io.bookmanagement.entities.Books;

public interface BooksService {

	public List<Books> getBooks();
	
	public Books getBooks(long bookId);
	
	public Books addBooks(Books books);
	
	public Books updateBooks(Books book);
	
	public void deleteBooks(long parselong);
}
