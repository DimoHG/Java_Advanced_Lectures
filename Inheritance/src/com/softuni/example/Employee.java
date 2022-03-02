package com.softuni.example;

public class Employee extends Person {
    private String company;

    public Employee(String name, int age) {
        super(name, age);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.name + " ";
    }
}
