package example;

import java.util.List;

public class ZooKeeper <T extends Animal> {
    List<T> animals;

    public void sleepAllAnimals(){
        for (T animal : animals) {
            animal.sleep();
        }
    }
}
