package practicing_place.week_03;

import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        if (distance <= 10)
            System.out.printf("Point (%.1f, %.1f) is in the circle", x, y);
        else
            System.out.printf("Point (%.1f, %.1f) is not in the circle", x, y);
    }

}
