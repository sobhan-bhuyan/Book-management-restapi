package com.sobhan.io.bookmanagement.services;

import java.util.List;

import com.sobhan.io.bookmanagement.entities.Books;

public interface BooksService {

	public List<Books> getBooks();
	
	public Books getBook(long bookId);
	
	public List<Books> addBooks(List<Books> books);
	
	public Books updateBook(Books books);

	public void deleteBook(long parselong);
}
