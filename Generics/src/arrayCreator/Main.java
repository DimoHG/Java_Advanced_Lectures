package arrayCreator;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = ArrayCreator.<String>create(String.class, 5, "Pesho");
        Integer[] integerArray = ArrayCreator.create(5, new Integer(12));

    }
}
