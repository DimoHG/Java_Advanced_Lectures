package com.softuni;

import com.softuni.example.OperaSinger;

public class Main {

    public static void main(String[] args) {
        OperaSinger operaSinger = new OperaSinger();
        System.out.println(operaSinger.getClass().getSimpleName());
        System.out.println(operaSinger.getClass().getName());
    }
}
