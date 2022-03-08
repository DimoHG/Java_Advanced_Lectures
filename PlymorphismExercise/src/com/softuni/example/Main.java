package com.softuni.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Override -> Runtime Polymorphism -> пренаписване на метод
        //Overloading -> Compile time polymorphism -> презареждане на метод
        //instanceOf
        Singer rockSinger = new OperaSinger();

        rockSinger.sing();
        if(rockSinger instanceof RockSinger){

            RockSinger myRockSinger = ((RockSinger) rockSinger);
        }

    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }
}
