package practicing_place.week_02;

import java.util.Scanner;

public class IntegerDigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int inputNumber = input.nextInt();

        int firstDigit = inputNumber % 10;
        inputNumber /= 10;

        int secondDigit = inputNumber % 10;
        inputNumber /= 10;

        int lastDigit = inputNumber;

        System.out.println("The sum of the digits is: " + (firstDigit + secondDigit + lastDigit));
    }

}
