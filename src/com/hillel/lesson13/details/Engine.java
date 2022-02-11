package com.hillel.lesson13.details;

public class Engine {
    private final int power;
    private final String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Двигатель{" +
                "мощность=" + power + "лс" +
                ", производитель='" + company + '\'' +
                '}';
    }
}
