package tutorial_10;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to type in: ");
        int arrayLength = scanner.nextInt();

        int[] inputArray = new int[arrayLength];
        System.out.println("Type in an array you want to sort: ");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("===================================");
        System.out.println("Your sorted array: " + Arrays.toString(selectionSort(inputArray)));
    }

    public static int[] selectionSort(int[] inputArray) {
        int[] sortedArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            int p = i; // p: lowest position
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[p])
                    p = j;
            }
            sortedArray[i] = inputArray[p];
            inputArray[p] = inputArray[i];
        }
        return sortedArray;
    }

}
