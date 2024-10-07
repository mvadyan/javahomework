package com.teiran.org.javaprof.homework09092024.bookshelf.comparators;

import com.teiran.org.javaprof.homework09092024.bookshelf.model.Book;

import java.util.Comparator;

public class SortByYearOfRedaction implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}
