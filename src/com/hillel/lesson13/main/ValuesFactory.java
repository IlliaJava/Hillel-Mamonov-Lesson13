package com.hillel.lesson13.main;

import com.hillel.lesson13.details.Engine;
import com.hillel.lesson13.professions.Driver;
import com.hillel.lesson13.vehicles.Lorry;
import com.hillel.lesson13.vehicles.SportCar;

import java.util.Random;

public class ValuesFactory {
    private static final Random RANDOM = new Random();
    private static final int[] WEIGHTS = {1000, 1500, 2000, 2500};
    private static final int[] CARRYING = {1000, 2000, 3000, 5000, 10000, 20000, 24000};

    private enum markaList {
        Audi, Mercedes, Honda, BMW, Ford, Mitsubishi, Toyota
    }

    private enum fullNames {
        Иванов_Иван_Иванович, Петр_Ильич_Чайковский, Наполеон_Бонапарт_Алексеевич, Романова_Мария_Ивановна, Люк_Скайворек_Єнакович
    }

    private enum companies {
        Honda, Daimler, General_Motors, General_Electric, Yamaha, Scania, Rolls_Royce
    }

    public static String marka() {
        markaList[] names = markaList.values();
        return names[RANDOM.nextInt(names.length)].toString();
    }

    public static int weight() {
        return WEIGHTS[RANDOM.nextInt(WEIGHTS.length)];
    }

    public static int experience() {
        return RANDOM.nextInt(11) + 1;
    }

    public static int age() {
        return RANDOM.nextInt(49) + 18;
    }

    public static String fullName() {
        fullNames[] names = fullNames.values();
        return names[RANDOM.nextInt(names.length)].toString();
    }

    public static int power() {
        return RANDOM.nextInt(901) + 100;
    }

    public static String company() {
        companies[] names = companies.values();
        return names[RANDOM.nextInt(names.length)].toString();
    }

    public static int carrying() {
        return CARRYING[RANDOM.nextInt(CARRYING.length)];
    }

    public static double speed() {
        return RANDOM.nextInt(151) + 150.0 + Math.round(RANDOM.nextDouble() * 10) / 10.0;
    }

    public static Lorry generateNewLorry() {
        String marka = marka();
        int weight = weight();
        Driver driver = new Driver(age(), fullName(), experience());
        Engine engine = new Engine(power(), company());
        int carrying = carrying();
        return new Lorry(marka, weight, driver, engine, carrying);
    }

    public static SportCar generateNewSportCar() {
        String marka = marka();
        int weight = weight();
        Driver driver = new Driver(age(), fullName(), experience());
        Engine engine = new Engine(power(), company());
        double speed = speed();
        return new SportCar(marka, weight, driver, engine, speed);
    }
}
