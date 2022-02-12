package com.hillel.lesson13.professions;

import java.util.Calendar;

public abstract class Person {
    protected final String yearOfBirth;
    protected final String fullName;
    protected final int age;

    public Person(String yearOfBirth, String fullName) {
        this.yearOfBirth = yearOfBirth;
        this.fullName = fullName;
        age = calculateAge();
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Личность{" +
                "возраст=" + age +
                ", ФИО='" + fullName + '\'' +
                '}';
    }

    private int calculateAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String lastFourLetters = getYearOfBirth().substring(getYearOfBirth().length() - 4);
        return year - Integer.parseInt(lastFourLetters);
    }

}
