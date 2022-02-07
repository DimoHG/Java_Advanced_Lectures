import java.util.*;

public class Main {

    public static void main(String[] arguments) {
        List<String> animals = new ArrayList<>();

        animals.add("Zebra");
        animals.add("Dog");

        Iterator<String> myIterator = animals.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        for (int i = 0; i < animals.size(); i++) {

        }

        HashMap<String, Integer> myMap = new HashMap<>();

    }
    //Iterable -> нещо, което може да се итерира
    //Iterator -> нещото, което итерира.
    //Само един вараргс
    //Винаги трябва да бъдат последни в списъка

    public static void printNames(String school, String... firstNames) {
        System.out.println("School name is: " + school);
        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(firstNames[i]);
        }
    }

}
