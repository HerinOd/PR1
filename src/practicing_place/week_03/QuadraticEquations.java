package practicing_place.week_03;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0)
            System.out.println("The equation has two roots: " + ((-b + Math.sqrt(discriminant)) / 2 * a) + " and " + ((-b - Math.sqrt(discriminant)) / 2 * a));
        else if (discriminant == 0)
            System.out.println("The equation has one root: " + (-b / (2 * a)));
        else
            System.out.println("The equation has no real roots");
    }

}
