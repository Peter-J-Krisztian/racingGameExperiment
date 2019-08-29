package com.fasttrackit;

public class App {
    public static void main(String[] args) {

        RadioControlledCar firstCar = new RadioControlledCar();
        firstCar.name = "Dacia";
        firstCar.color = "Blue";
        firstCar.doorCount= 4;
        firstCar.wheelCount = 4;
        firstCar.mileage = 9.5;

        Engine daciaEngine = new Engine();
        daciaEngine.manufacturor = "Renault";

        firstCar.engine = daciaEngine;

        RadioControlledCar secondCar = new RadioControlledCar();
        secondCar.name = "Lada";
        secondCar.color = "Black";
        secondCar.doorCount = 2;
        secondCar.wheelCount = 4;
        secondCar.mileage = 8;

        Engine ladaengine = new Engine();
        ladaengine.manufacturor = "Lada";

        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(5.1);
        System.out.println("Hello");

    }
}
