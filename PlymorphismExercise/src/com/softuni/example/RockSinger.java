package com.softuni.example;

public class RockSinger implements Singer{

    private String favouriteGuitar;

    public void rideMotorcycle(){
        System.out.println("I'm riding motorcycle");
    }

    @Override
    public void sing(){
        System.out.println("Singing rock music");
    }
}
