package com.teiran.org.javaprof.homework21082024.bunsmachine.enums;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;

public enum CreamBunsType implements BunsTypeImpl {
    CUSTARDBUN (" custard bun"),
    EGGCREAMBUN ("bun with egg cream ");

    private String description;

    CreamBunsType(String description) {
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
