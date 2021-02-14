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
	
											//	List<Books> list;
	public BooksServiceimpl() {
		
		
											//		list = new ArrayList<>();
											//		list.add(new Books(145,"Java core Course","This course contains basics of java"));
											//		list.add(new Books(4343, "spring boot course","basics of spring boot "));
											//		list.add(new Books(1245,"python basics","Basics of python"));
	}
	
	
	
	@Override
	//GET all books
	public List<Books>getBooks() {
		return booksDao.findAll();
											//		return list;
	}



	@Override
	//GET single book by bookId
	public Books getBook(long bookId) {
		return booksDao.getOne(bookId);
	
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
	}


	@Override
	// Add single book
	public Books addBook(Books books) {
		booksDao.save(books);
		return books;
											//		list.add(books);
											//		return books;
	}
	
	@Override
	//PUT request to update a book
	public Books updateBook(Books books) {
		booksDao.save(books);
		return books;
											//		list.forEach(e-> {
											//			if (e.getId()== books.getId()) {
											//				e.setTitle(books.getTitle());
											//				e.setDescription((books.getDescription());
				
											//			}
											//		});
											//				return books;
				
	}
	
	@Override
	//Delete book
	public void deleteBook(long parseLong) {
		Books entity = booksDao.getOne(parseLong);
		booksDao.delete(entity);
											//		list = this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
	}

}
