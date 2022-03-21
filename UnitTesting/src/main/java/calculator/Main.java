package calculator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meow");
            }
        };

    }
}
