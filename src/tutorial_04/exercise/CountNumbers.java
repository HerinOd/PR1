package tutorial_04.exercise;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        long number = input.nextLong();

        if (number < 0) {
            number *= -1;
        }

        if (number >= 10000000000L) {
            System.out.println("Number is too large (should be less than ten billion).");
            return;
        }

        int count = 1;
        long temp = number;
        while (temp >= 10) {
            temp /= 10;
            count++;
        }

        System.out.println("The number has " + count + " digits.");
    }
}

