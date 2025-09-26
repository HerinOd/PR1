package tutorial_03.business;

import java.util.Scanner;

public class CheckISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of ISBN: ");
        int isbn = input.nextInt();

        String isbnStr = String.format("%09d", isbn); // thêm số 0 nếu thiếu

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (isbnStr.charAt(i) - '0') * (i + 1);
        }

        int checksum = sum % 11;

        if (checksum == 10)
            System.out.println("The ISBN-10 number is " + isbnStr + "X");
        else
            System.out.println("The ISBN-10 number is " + isbnStr + checksum);
    }
}
