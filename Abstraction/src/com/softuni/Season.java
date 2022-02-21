package com.softuni;

public enum Season {

    SUMMER("Summer", 24, "medium"),
    SPRING("Spring", 15, "medium"),
    AUTUMN("Autumn", 15, "medium"),
    WINTER("Winter", 10, "low");

    private String name;
    private double temperature;
    private String chancesOfRain;

    private Season(String name, double temperature, String chancesOfRain) {
        this.name = name;
        this.temperature = temperature;
        this.chancesOfRain = chancesOfRain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getChancesOfRain() {
        return chancesOfRain;
    }

    public void setChancesOfRain(String chancesOfRain) {
        this.chancesOfRain = chancesOfRain;
    }
}
