package com.sobhan.io.bookmanagement.controller;

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

import com.sobhan.io.bookmanagement.entities.Books;
import com.sobhan.io.bookmanagement.services.BooksService;

@RestController

public class Controller {
	@Autowired
	private BooksService booksserv;

	// GET list of all books
	@GetMapping("/books")
	public List<Books> getBooks() {

		return this.booksserv.getBooks();
	}

	// GET single book as per id
	@GetMapping("/books/{bookId}")
	public Books getBook(@PathVariable String bookId) {

		return this.booksserv.getBook(Long.parseLong(bookId));
	}

	// ADD  one or more books
	@PostMapping("/books")
	public List<Books> addBooks(@RequestBody List<Books> books) {
			return this.booksserv.addBooks(books);
	}

	// update books using put
	@PutMapping("/books")
	public Books updateBook(@RequestBody Books books) {
		return this.booksserv.updateBook(books);
	}

	// delete books in entry
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBooks(@PathVariable String bookId){
		try {
			this.booksserv.deleteBook(Long.parseLong(bookId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
}

}