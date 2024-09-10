package com.teiran.org.javaprof.homework21082024.bunsmachine.enums;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;

public enum JamBunsType implements BunsTypeImpl {

    STRAWBERRYJAMBUN("Bun with strawberry jam"),
    CHERYJAMBUN("Bun with chery jam"),
    RASPBERRYJAMBUN("Bun with raspberry jam");

    private String description;

    JamBunsType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int index() {
        return this.ordinal()+1;
    }

    @Override
    public String getName() {

        return this.description;
    }
}
