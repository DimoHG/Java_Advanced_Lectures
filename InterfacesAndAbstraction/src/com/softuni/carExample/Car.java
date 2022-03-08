package com.softuni;

public class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }
}
