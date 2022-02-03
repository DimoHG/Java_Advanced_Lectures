package com.softuni;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private static int counter;

    public Dog(String name){
        this.name = name;
        counter++;
    }

    public Dog(String name, int age){
        this(name);
        this.age = age;
        counter++;
    }

    public Dog(int age, String name){
        this(name);
        this.age = age;
        counter++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("Bark bark");
    }


    public String toString(){
        return String.format("My dog is called %s", name);
    }

    public static int getCounter() {
        return counter;
    }

    public String formatDogName(){
        return String.format("My dog is called %s", name);
    }
}
