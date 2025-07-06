package com.library.v2;

import com.library.repository.BookRepository;

public class BookServiceV2 {

    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("========== [Exercise 2: Dependency Injection] ==========");
        System.out.println("DI Check: BookServiceV2 is using BookRepository via setter injection.");
        System.out.println("Calling repository method to save book...");
        System.out.println("--------------------------------------------------------------");
        bookRepository.saveBook();
        System.out.println("Repository call completed. Returning control to main application.");
        System.out.println("==============================================================");
    }

}
