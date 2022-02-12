package com.hillel.lesson13.vehicles;

import com.hillel.lesson13.details.Engine;
import com.hillel.lesson13.professions.Driver;

public abstract class Car {
    protected final String marka;
    protected String carClass;
    protected final int weight;
    protected final Driver driver;
    protected final Engine engine;

    public Car(String marka, int weight, Driver driver, Engine engine) {
        this.marka = marka;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getMarka() {
        return marka;
    }

    public String getYearOfBirth() {
        return driver.getYearOfBirth();
    }

    public void start() {
        System.out.println(getCarClass() + " " + getMarka() + " Поехали");
    }

    public void stop() {
        System.out.println(getCarClass() + " " + getMarka() + " Останавливаемся");
    }

    public void turnRight() {
        System.out.println(getCarClass() + " " + getMarka() + " Поворот направо");
    }

    public void turnLeft() {
        System.out.println(getCarClass() + " " + getMarka() + " Поворот налево");
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
