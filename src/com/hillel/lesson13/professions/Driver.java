package com.hillel.lesson13.professions;

public class Driver extends Person {
    private final int experience;

    public Driver(String yearOfBirth, String fullName, int experience) {
        super(yearOfBirth, fullName);
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Водитель{" +
                "возраст=" + age +
                ", ФИО='" + fullName +
                ", опыт=" + experience + " лет" + '\'' +
                '}';
    }
}
