package com.teiran.org.javaprof.homework09092024.bookshelf;

import com.teiran.org.javaprof.homework09092024.bookshelf.model.BookShelfImpl;
import com.teiran.org.javaprof.homework09092024.bookshelf.services.BookShelfService;

import java.util.Scanner;

public class Controller {

    public void start() {
        BookShelfService bookShelfService = new BookShelfService(new BookShelfImpl());

        Scanner scanner = new Scanner(System.in);
        bookShelfService.printAllBoobs();

        System.out.println("-------------------------------------------");

        System.out.println("make please choice of sort:");
        System.out.println("1 - Sort by name of book");
        System.out.println("2 - Sort by year of redaction");
        System.out.println("3 - Sort by count of pages");
        System.out.println("4 - Sort by author's birth year");

        int sort = scanner.nextInt();

        switch (sort) {
            case 1:
                bookShelfService.sortByName();
                break;
            case 2:
                bookShelfService.sortByYearOfRedaction();
                break;
            case 3:
                bookShelfService.sortByCountOfPages();
                break;
            case 4:
                bookShelfService.sortByAuthorBirthYear();
                break;
        }
    }
}
