package com.rajib.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(304, "Hibernate", 180));
        books.add(new Book(273, "Spring", 200));
        books.add(new Book(876, "WebServices", 300));
        return books;
    }
}
