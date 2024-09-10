package com.teiran.org.javaprof.homework21082024.bunsmachine.enums;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;

public enum BunType implements BunsTypeImpl {
    JAMBUN("Buns with jam"),
    MEATBUN("Buns with meat"),
    CREAMBUN("Buns with cream");

    private String description;


    BunType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public int index() {
        return this.ordinal() + 1;
    }

    public String getName() {
        return this.name();
    }
}
