package tutorial_03.calendar;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month and a year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        int days;
        String monthName;

        switch (month) {
            case 1: days = 31; monthName = "January"; break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    days = 29;
                else days = 28;
                monthName = "February"; break;
            case 3: days = 31; monthName = "March"; break;
            case 4: days = 30; monthName = "April"; break;
            case 5: days = 31; monthName = "May"; break;
            case 6: days = 30; monthName = "June"; break;
            case 7: days = 31; monthName = "July"; break;
            case 8: days = 31; monthName = "August"; break;
            case 9: days = 30; monthName = "September"; break;
            case 10: days = 31; monthName = "October"; break;
            case 11: days = 30; monthName = "November"; break;
            case 12: days = 31; monthName = "December"; break;
            default:
                System.out.println("Invalid"); return;
        }
        System.out.println(monthName + " " + year +" had "+ days + " days.");
    }
}
