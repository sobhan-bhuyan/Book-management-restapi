package com.sobhan.io.bookmanagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobhan.io.bookmanagement.dao.BooksDao;
import com.sobhan.io.bookmanagement.entities.Books;
@SuppressWarnings("unused")
@Service
public class BooksServiceimpl implements BooksService {
	
	@Autowired
	private BooksDao booksDao;
	
										
	public BooksServiceimpl() {
		
	}
	
	
	
	@Override
	//GET all books
	public List<Books>getBooks() {
		return booksDao.findAll();
											
	}



	@Override
	//GET single book by bookId
	public Books getBook(long bookId) {
		return booksDao.getOne(bookId);
	
											
	}


	@Override
	// Add single book
	public List<Books> addBooks(List<Books> books) {
		 List<Books> response = (List<Books>) booksDao.saveAll(books);
		return response;
											
	}
	
	@Override
	//PUT request to update a book
	public Books updateBook(Books books) {
		booksDao.save(books);
		return books;
										
				
	}
	
	@Override
	//Delete book
	public void deleteBook(long parseLong) {
		Books entity = booksDao.getOne(parseLong);
		booksDao.delete(entity);
										
	}
	

}
