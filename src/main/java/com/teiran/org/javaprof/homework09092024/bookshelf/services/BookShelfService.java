package com.teiran.org.javaprof.homework09092024.bookshelf.services;

import com.teiran.org.javaprof.homework09092024.bookshelf.model.BookShelfImpl;
import com.teiran.org.javaprof.homework09092024.bookshelf.comparators.SortByAuthorBirthYear;
import com.teiran.org.javaprof.homework09092024.bookshelf.comparators.SortByCountOfPages;
import com.teiran.org.javaprof.homework09092024.bookshelf.comparators.SortByName;
import com.teiran.org.javaprof.homework09092024.bookshelf.comparators.SortByYearOfRedaction;

import java.util.Collections;

public class BookShelfService {

    private BookShelfImpl bookShelf;

    public BookShelfService(BookShelfImpl bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void printAllBoobs() {
        bookShelf.getAllBooks();
    }

    public void sortByName() {
        SortByName sortByName = new SortByName();
        Collections.sort(this.bookShelf.getBooks(), sortByName);
        System.out.println("------------------------------------------");
        System.out.println("Sorted by Name:");
        System.out.println("------------------------------------------");
        this.printAllBoobs();

    }

    public void sortByYearOfRedaction() {
        SortByYearOfRedaction sortByYearOfRedaction = new SortByYearOfRedaction();
        Collections.sort(this.bookShelf.getBooks(), sortByYearOfRedaction);
        System.out.println("------------------------------------------");
        System.out.println("Sorted by year of redaction:");
        System.out.println("------------------------------------------");
        this.printAllBoobs();
    }

    public void sortByCountOfPages() {
        SortByCountOfPages sortByCountOfPages = new SortByCountOfPages();
        Collections.sort(this.bookShelf.getBooks(), sortByCountOfPages);
        System.out.println("------------------------------------------");
        System.out.println("Sorted by count of pages:");
        System.out.println("------------------------------------------");
        this.printAllBoobs();
    }

    public void sortByAuthorBirthYear() {
        SortByAuthorBirthYear sortByAuthorBirthYear = new SortByAuthorBirthYear();

        Collections.sort(this.bookShelf.getBooks(), sortByAuthorBirthYear);
        System.out.println("------------------------------------------");
        System.out.println("Sorted by Author's birth year:");
        System.out.println("------------------------------------------");
        this.printAllBoobs();
    }
}
