package practicing_place.week_04;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[10];
        int[] distinctNumbers = new int[10];
        int count = 0;
        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            inputNumbers[i] =  scanner.nextInt();
            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (inputNumbers[i] == distinctNumbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[count] = inputNumbers[i];
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++)
            System.out.print(distinctNumbers[i] + " ");
    }

}
