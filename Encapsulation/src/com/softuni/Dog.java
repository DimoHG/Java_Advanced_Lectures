package com.softuni;

public class Dog extends Animal {

    public Dog(){
    }

    @Override
    protected void speak(){
        System.out.println("bark bark");
    }

    @Override
    public String toString() {
        return String.format("My dog is called %s and is %d years old", this.name, this.age);
    }


}
