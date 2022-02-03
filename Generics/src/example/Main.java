package example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        ZooKeeper<Tiger> zooKeeper = new ZooKeeper<>();

        Tiger tiger = new Tiger();
        tiger.sleep();
    }
}
