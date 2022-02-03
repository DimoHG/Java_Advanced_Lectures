package scale;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("12", "11");
        System.out.println(stringScale.getHeavier());
    }
}
