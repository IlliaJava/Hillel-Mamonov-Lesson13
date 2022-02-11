package com.hillel.lesson13.main;
// Task 1. Car
      /*  1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
        Класс Driver содержит поля - ФИО, стаж вождения.

        Класс Engine содержит поля - мощность, производитель.

        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
        А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.

        Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
        Пусть класс Driver расширяет класс Person.
*/

import com.hillel.lesson13.vehicles.Car;
import com.hillel.lesson13.vehicles.Lorry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> autoPark = new ArrayList<>();

        Lorry lorry = ValuesFactory.generateNewLorry();
        Car sportCar = ValuesFactory.generateNewSportCar();

        autoPark.add(lorry);
        autoPark.add(sportCar);

        System.out.println(autoPark);
        System.out.println();

        lorry.start();
        lorry.turnLeft();
        lorry.stop();

        System.out.println();
        sportCar.start();
        sportCar.turnRight();
        sportCar.stop();

    }
}
