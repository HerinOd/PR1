package tutorial_07.activity2;

import java.util.Scanner;

public class RecursiveDec2Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number == 0)
            System.out.println("Binary form: 0");
        else
            System.out.println("Binary form: " + convertToBinary(number));
    }

    public static String convertToBinary(int n) {
        if (n == 0)
            return "";

        int remainder = n % 2;
        int quotient = n / 2;

        return convertToBinary(quotient) + remainder;
    }

}
