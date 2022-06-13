package com.company;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.brand = "BMW M8";
        firstCar.year = 2010;
        firstCar.power = 625;
        firstCar.tank = 68.1;

        System.out.println("\nFirst car info:");
        System.out.println("Brand: " + firstCar.brand);
        System.out.println("Year of issue: " + firstCar.year);
        System.out.println("Power: " + firstCar.power);
        System.out.println("Tank: " + firstCar.tank);

        Car secondCar = new Car();
        secondCar.brand = "Brabus Rocket 900";
        secondCar.year = 2016;
        secondCar.power = 900;
        secondCar.tank = 96.2;

        System.out.println("\nSecond car info:");
        System.out.println("Brand: " + secondCar.brand);
        System.out.println("Year of issue: " + secondCar.year);
        System.out.println("Power: " + secondCar.power);
        System.out.println("Tank: " + secondCar.tank);

        Car orderCar = new Car();
        orderCar.brand = "Porsche 911 turbo s";
        orderCar.year = 2021;
        orderCar.power = 620;
        orderCar.tank = 42.2;

        System.out.println("\nOrder car info:");
        System.out.println("Brand: " + orderCar.brand);
        System.out.println("Year of issue: " + orderCar.year);
        System.out.println("Power: " + orderCar.power);
        System.out.println("Tank: " + orderCar.tank);


    }

}
