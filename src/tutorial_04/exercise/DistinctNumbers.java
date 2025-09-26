package tutorial_04.exercise;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        int[] distinctNumbers = new int[10];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            boolean isFound = false;
            for (int j = 0; j < count; j++) {
                if (num == distinctNumbers[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                distinctNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++)
            System.out.print(distinctNumbers[i] + " ");
    }
}
