package com.library.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementAppV2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-v2.xml");
        BookServiceV2 bookService = (BookServiceV2) context.getBean("bookServiceV2");
        bookService.addBook();
    }
}
