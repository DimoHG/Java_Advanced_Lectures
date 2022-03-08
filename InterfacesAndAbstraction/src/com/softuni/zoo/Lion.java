package com.softuni;

public class Lion implements Animal{

    public String getFood(){
        return "meat";
    }

    @Override
    public void speak() {
        System.out.println("I am lion");
    }
}
