package com.teiran.org.javaprof.homework09092024.bookshelf.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Book {

    private String name;

    int year;

    int countPages;

    com.teiran.org.javaprof.homework09092024.bookshelf.model.Author Author;

}
