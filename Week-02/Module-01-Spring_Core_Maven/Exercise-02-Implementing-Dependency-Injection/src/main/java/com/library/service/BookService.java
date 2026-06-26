package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails() {

        System.out.println("BookService bean created successfully.");

        System.out.println(bookRepository.getRepositoryMessage());

    }

}