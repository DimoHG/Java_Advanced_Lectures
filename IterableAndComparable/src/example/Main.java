package example;

import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("Apple", "Banana", "Orange");

        Iterator<String> shopAssistant = supermarket.iterator();
        for (String fruit : supermarket) {

        }
        shopAssistant.next();
        shopAssistant.next();
        shopAssistant.next();
        shopAssistant.next();
        shopAssistant.next();
        shopAssistant.next();
    }
}
