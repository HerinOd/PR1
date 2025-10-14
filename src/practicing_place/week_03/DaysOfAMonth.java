package practicing_place.week_03;

import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt(); input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.next();

        int daysInMonth;

        switch (month) {
            case "Jan":
                daysInMonth = 31; break;
            case "Feb":
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
                break;
            case "Mar": daysInMonth = 31; break;
            case "Apr": daysInMonth = 30; break;
            case "May": daysInMonth = 31; break;
            case "Jun": daysInMonth = 30; break;
            case "Jul": daysInMonth = 31; break;
            case "Aug": daysInMonth = 31; break;
            case "Sep": daysInMonth = 30; break;
            case "Oct": daysInMonth = 31; break;
            case "Nov": daysInMonth = 30; break;
            case "Dec": daysInMonth = 31; break;
            default:
                System.out.println("Invalid month!"); return;
        }

        System.out.println(month + " " + year + " has " + daysInMonth + " days.");
    }

}
