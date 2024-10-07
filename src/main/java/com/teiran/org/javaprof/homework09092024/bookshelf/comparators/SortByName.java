package com.teiran.org.javaprof.homework09092024.bookshelf.comparators;

import com.teiran.org.javaprof.homework09092024.bookshelf.model.Book;
import java.util.Comparator;

public class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        String one = o1.getName();
        String two = o2.getName();

        return one.compareTo(two); // -1, 0, 1
    }
}
