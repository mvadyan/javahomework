package com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces;

public abstract class Bun {

    private BunsTypeImpl type;

    public Bun(BunsTypeImpl type) {
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println(type.getName() + " is ready");
        return "Bun{" +
                "type=" + type +
                '}';
    }
}
