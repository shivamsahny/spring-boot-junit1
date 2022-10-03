package com.javatrainingschool;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatrainingschool.entity.Book;
import com.javatrainingschool.repsoitory.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		List<Book> allBooks = (List<Book>) bookRepo.findAll();
		allBooks.forEach(b -> b.setName(b.getName() + "-b"));
		return allBooks;
		
		
}
}
