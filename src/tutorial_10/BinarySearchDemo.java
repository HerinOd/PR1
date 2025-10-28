package tutorial_10;

import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number do you want to enter: ");
        int arrayLength = scanner.nextInt();

        int[] sortedArray = new int[arrayLength];
        System.out.println("Enter a sorted array: ");
        for (int i = 0; i < arrayLength; i++)
            sortedArray[i] = scanner.nextInt();

        System.out.print("Search a number: ");
        int k = scanner.nextInt();
        int position = binarySearch(sortedArray, k, 0, arrayLength -1);
        if (position == -1)
            System.out.println("No number is found.");
        else
            System.out.println("Position: " + (position + 1));
    }

    public static int binarySearch(int[] sortedArray, int k, int low, int high) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (sortedArray[mid] == k)
            return mid;
        else if (sortedArray[mid] > k)
            return binarySearch(sortedArray, k, low, mid - 1);
        else
            return binarySearch(sortedArray, k, mid + 1, high);
    }

}
