package com.hillel.lesson13.professions;

public abstract class Person {
    protected final int age;
    protected final String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Личность{" +
                "возраст=" + age +
                ", ФИО='" + fullName + '\'' +
                '}';
    }
}
