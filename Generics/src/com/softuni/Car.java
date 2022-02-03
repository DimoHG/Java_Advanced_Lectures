package com.softuni;

public class Car extends Object{
    private String color;
    private int horsePower;
    private String brand;

    public Car(String color, int horsePower, String brand) {
        this.color = color;
        this.horsePower = horsePower;
        this.brand = brand;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
