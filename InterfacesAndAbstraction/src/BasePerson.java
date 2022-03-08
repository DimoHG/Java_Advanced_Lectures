package com.softuni.person;

public abstract class BasePerson implements Person {
    String name;

    public BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
