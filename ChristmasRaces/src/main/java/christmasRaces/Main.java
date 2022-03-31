package christmasRaces;

import christmasRaces.core.ControllerImpl;
import christmasRaces.core.EngineImpl;
import christmasRaces.core.interfaces.Controller;
import christmasRaces.entities.cars.Car;
import christmasRaces.entities.drivers.Driver;
import christmasRaces.entities.races.Race;
import christmasRaces.io.ConsoleReader;
import christmasRaces.io.ConsoleWriter;
import christmasRaces.repositories.CarRepository;
import christmasRaces.repositories.DriverRepository;
import christmasRaces.repositories.RaceRepository;
import christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

        Controller controller = new ControllerImpl(driverRepository, carRepository, raceRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }


    //Controlller -> holds the business logic. Holds the implementation of the commands
    //Repository -> хранилище. Там пазим обекти
    //Driver, Car, Race -> обекти.
    //Engine -> създава всичко и стартира задачата
}
