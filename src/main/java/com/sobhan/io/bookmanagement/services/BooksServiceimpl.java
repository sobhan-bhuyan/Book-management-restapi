package com.sobhan.io.bookmanagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sobhan.io.bookmanagement.entities.Books;
@Service
public class BooksServiceimpl implements BooksService {

	List<Books> list;
	public BooksServiceimpl() {
		list = new ArrayList<>();
		list.add(new Books(145,"Java core Course","This course contains basics of java"));
		list.add(new Books(4343, "spring boot course","basics of spring boot "));
		list.add(new Books(1245,"python basics","Basics of python"));
	}
	
	
	
	@Override
	public List<Books> getBooks() {
		return list;
	}



	@Override
	public Books getBooks(long bookId) {
		Books c=null;
		for(Books book:list)
		{
			if(book.getId()==bookId)
			{
				c = book;
				break;
			}
		}
		return c;
	}



	@Override
	public Books addBooks(Books books) {
		list.add(books);
		return books;
	}

}
