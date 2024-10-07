package com.teiran.org.javaprof.homework09092024.bookshelf.model;

import com.teiran.org.javaprof.homework09092024.bookshelf.BookShelf;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class BookShelfImpl implements BookShelf {

    private List<Book> books = new ArrayList<>();

    public BookShelfImpl() {
        this.init();
    }

    public void getAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private void init() {
        books.add(new Book("Harry Potter and the Deathly Hallows", 2007, 784, new Author("Rowling", 1965)));
        books.add(new Book("Harry Potter and the Philosopher's Stone", 2001, 852, new Author("Rowling", 1965)));
        books.add(new Book("Harry Potter and the Order of the Phoenix", 2006, 658, new Author("Rowling", 1965)));
        books.add(new Book("Memoirs of a Geisha", 1997, 425, new Author("Arthur Golden", 1956)));
        books.add(new Book("Hannibal", 1999, 484, new Author(" Harris", 1940)));
        books.add(new Book("The Lord of the Rings", 1954, 1178, new Author("Tolkien", 1842)));
        books.add(new Book("The Ghost", 2016, 208, new Author("Jason Reynolds", 1983)));
        books.add(new Book("The House at Riverton", 2006, 337, new Author("Kate Morton", 1976)));
        books.add(new Book("Small Island", 2004, 785, new Author("Andrea Levy", 1956)));
        books.add(new Book("Code Da Vinci", 2003, 454, new Author("Don Brown", 1964)));

    }
}
