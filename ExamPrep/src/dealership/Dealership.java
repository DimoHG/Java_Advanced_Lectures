package dealership;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Dealership { //repository
    private List<Car> data; //entity
    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (Car car : this.data) {
            if(car.getManufacturer().equals(manufacturer)
            && car.getModel().equals(model)){
                this.data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar(){
        Car car = null;
        int latestYear = Integer.MIN_VALUE;

        for (Car currentCar : this.data) {
            if(currentCar.getYear() > latestYear){
                latestYear = currentCar.getYear();
                car = currentCar;
            }
        }
        return car;
    }

    public Car getCar(String manufacturer, String model){
        for (Car car : this.data) {
            if(car.getManufacturer().equals(manufacturer)
            && car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("The cars are in a car dealership %s:%n", this.name));

        for (Car car : this.data) {
            stringBuilder.append(car.toString()).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }


}
