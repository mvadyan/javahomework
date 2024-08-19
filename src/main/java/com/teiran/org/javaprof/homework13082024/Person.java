package com.teiran.org.javaprof.homework13082024;

public class Person {

    private String fullName;

    private int age;

    private Phone phone;

    public Person() {
    }

    public Person(String fullName, Phone phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is walking");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public Phone getPhone() {
        return phone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


}
