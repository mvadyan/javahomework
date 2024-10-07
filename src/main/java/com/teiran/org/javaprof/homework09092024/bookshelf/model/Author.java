package com.teiran.org.javaprof.homework09092024.bookshelf.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Author {

    private String name;

    private int yearOfBirth;

}
