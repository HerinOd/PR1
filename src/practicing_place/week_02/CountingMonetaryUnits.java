package practicing_place.week_02;

import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money: ");
        double inputMoney = input.nextDouble();

        int cents = (int) (inputMoney * 100);
        int dollars = cents / 100;
        int remainingCents = cents % 100;

        int quarters = remainingCents / 25;
        remainingCents %= 25;

        int dimes = remainingCents / 10;
        remainingCents %= 10;

        int nickels = remainingCents / 5;
        remainingCents %= 5;

        int pennies = remainingCents;

        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }

}
