package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayMessage() {

        System.out.println("BookService bean loaded successfully.");
        System.out.println(bookRepository.getBookMessage());

    }

}