package rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinatesOfRectangle = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Point bottomLeft = new Point(coordinatesOfRectangle[0], coordinatesOfRectangle[1]);

        int xTopRight = coordinatesOfRectangle[2];
        int yTopRight = coordinatesOfRectangle[3];

        Point topRight = new Point(xTopRight, yTopRight);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point current = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(current));
        }

    }

}
