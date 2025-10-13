package tutorial_06.activity3;

import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        FactorGenerator factorGenerator = new FactorGenerator(inputNumber);
        System.out.print("The factors of the number: ");
        while (factorGenerator.hasMoreFactors()) {
            int factor = factorGenerator.nextFactor();
            System.out.print(factor + " ");
        }

        System.out.println(" ");
        System.out.println(factorGenerator.getNumberToFactor());
    }

}
