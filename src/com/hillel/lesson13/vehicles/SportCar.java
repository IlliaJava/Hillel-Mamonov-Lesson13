package com.hillel.lesson13.vehicles;

import com.hillel.lesson13.details.Engine;
import com.hillel.lesson13.professions.Driver;

public class SportCar extends Car {
    private final double speed;

    public SportCar(String marka, int weight, Driver driver, Engine engine, double speed) {
        super(marka, weight, driver, engine);
        this.speed = speed;
        this.setCarClass("Гоночная");
    }

    @Override
    public String toString() {
        return "\nАвто{" +
                "бренд='" + marka + '\'' +
                ", класс='" + carClass + '\'' +
                ", вес=" + weight + " кг" +
                ", водитель=" + driver +
                ", двигатель=" + engine +
                ", скорость=" + speed + " км/ч" + '\'' +
                '}';
    }
}


