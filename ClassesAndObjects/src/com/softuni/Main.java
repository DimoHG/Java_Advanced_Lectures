package com.softuni;

import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Ivancho");
        System.out.println(Dog.getCounter());
        Dog dog2 = new Dog("Petarcho");
        System.out.println(Dog.getCounter());

        Dog.getCounter();


    }
}

//toString -> текстова репрезентация на обект
//hashCode -> числова репрезентация на обект
