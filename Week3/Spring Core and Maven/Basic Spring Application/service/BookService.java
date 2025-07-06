package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("========== [Exercise 1: Basic Spring Configuration] ==========");
        System.out.println("Step 1: BookService initialized.");
        System.out.println("Step 2: Requesting to save a book...");
        System.out.println("--------------------------------------------------------------");
        bookRepository.saveBook(); // ✅ Will now work
        System.out.println("Step 3: BookService completed operation.");
        System.out.println("==============================================================");
    }
}
