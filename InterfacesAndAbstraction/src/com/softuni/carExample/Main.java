package com.softuni;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.startCar();
        car.stopCar();
    }
}
