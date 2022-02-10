package dealership;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Volvo", "XC90", 2019);
        Car car2 = new Car("BMW", "X5", 2018);
        Car car3 = new Car("Mercedes", "GLE", 2017);

        Dealership dealership = new Dealership("Softuni", 5);
        dealership.add(car);
        dealership.add(car2);
        dealership.add(car3);

        System.out.println(dealership.getCar("BMW", "X5"));
        System.out.println(dealership.getCar("VW", "Passat"));

        System.out.println(dealership.getCount());
        System.out.println(dealership.getStatistics());


    }

    public static void printMessage(String message){
    }
}
