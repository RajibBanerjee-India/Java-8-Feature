package com.rajib.lambda.example;

import java.util.List;

public class BookService {

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
        books.sort((book1, book2) -> book2.getName().compareTo(book1.getName()));
        return books;
    }
}
