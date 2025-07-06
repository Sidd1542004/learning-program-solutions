package com.library.v3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementAppV3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-v3.xml");

        BookServiceV3 service = (BookServiceV3) context.getBean("bookServiceV3");
        service.addBook();
    }
}
