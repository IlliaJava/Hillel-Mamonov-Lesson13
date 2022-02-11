package com.hillel.lesson13.vehicles;

import com.hillel.lesson13.details.Engine;
import com.hillel.lesson13.professions.Driver;

public class Lorry extends Car {
    private final int carrying;

    public Lorry(String marka, int weight, Driver driver, Engine engine, int carrying) {
        super(marka, weight, driver, engine);
        this.carrying = carrying;
        this.setCarClass("Грузовик");
    }

    @Override
    public String toString() {
        return "\nАвто{" +
                "бренд='" + marka + '\'' +
                ", класс='" + carClass + '\'' +
                ", вес=" + weight + " кг" +
                ", водитель=" + driver +
                ", двигатель=" + engine +
                ", грузоподьемность=" + carrying + " кг" + '\'' +
                '}';
    }
}
