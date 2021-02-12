package com.sobhan.io.bookmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sobhan.io.bookmanagement.entities.Books;

public interface BooksDao extends JpaRepository<Books, Long>{

}
