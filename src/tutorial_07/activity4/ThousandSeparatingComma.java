package tutorial_07.activity4;

import java.util.*;

public class ThousandSeparatingComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inRange = false;
        while (!inRange) {
            try {
                System.out.print("Please enter an integer between 1000 and 999999: ");
                int number = scanner.nextInt();
                if (number >= 1000 && number <= 999999) {
                    System.out.println(separateComma(number));
                    inRange = true;
                }
                else
                    throw new InputMismatchException();
            }
            catch (InputMismatchException e) {
                System.out.println("-----------------------");
                System.out.println("Error: " + e.getCause());
                System.out.println("-----------------------");

                System.out.print("Press any key to continue: ");
                scanner.nextLine();
            }
        }
    }

    public static String separateComma(int integer) {
        int hundreds = integer % 1000;
        int thousands = integer / 1000;

        return thousands + "," + hundreds;
    }

}
