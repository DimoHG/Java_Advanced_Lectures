package com.softuni;

public class Goat implements Animal {

    public String getFood() {
        return "grass";
    }

    @Override
    public void speak() {
        System.out.println("I am goat");
    }


}
