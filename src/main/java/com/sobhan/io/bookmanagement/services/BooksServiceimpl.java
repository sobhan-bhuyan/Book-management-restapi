package com.sobhan.io.bookmanagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobhan.io.bookmanagement.entities.Books;
@Service
public class BooksServiceimpl implements BooksService {
	@Autowired
	private BooksDao booksDao;
	
//	List<Books> list;
	public BooksServiceimpl() {
//		list = new ArrayList<>();
//		list.add(new Books(145,"Java core Course","This course contains basics of java"));
//		list.add(new Books(4343, "spring boot course","basics of spring boot "));
//		list.add(new Books(1245,"python basics","Basics of python"));
	}
	
	
	
	@Override
//	public List<Books> getBooks() {
//		return list;
	}



	@Override
//	public Books getBooks(long bookId) {
//		Books c=null;
//		for(Books books:list)
//		{
//			if(books.getId()==bookId)
//			{
//				c = books;
//				break;
//			}
//		}
//		return c;
//	}



	@Override
	public Books addBooks(Books books) {
		list.add(books);
		return books;
	}
	
	@Override
	public Books updateBooks(Books books) {
		
		list.forEach(e-> {
			if (e.getId()== books.getId()) {
				e.setTitle(books.getTitle());
				e.setDescription((books.getDescription());
				
			}
		});
				return books;
				
	}
	
	@Override
	public void deleteBooks(long parselong) {
		list = this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
	}

}
