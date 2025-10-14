package practicing_place.week_02;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double miniumRunwayLength = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minium runway length for this airplane is: " + miniumRunwayLength);
    }

}
