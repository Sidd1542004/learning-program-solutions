package com.example.springrest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryXmlLoader {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");

        System.out.println("Country Code: " + country.getCode());
        System.out.println("Country Name: " + country.getName());
    }
}
