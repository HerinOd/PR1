package practicing_place.week_03;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String input = scanner.next();

        char majorCharacter = input.charAt(0);
        char yearCharacter = input.charAt(1);

        String major;
        String year;

        switch (majorCharacter) {
            case 'M': major = "Mathematics"; break;
            case 'C': major = "Computer Science"; break;
            case 'I': major = "Information Technology"; break;
            default:
                System.out.println("Invalid Input"); return;
        }

        switch (yearCharacter) {
            case '1': year = "Freshman"; break;
            case '2': year = "Sophomore"; break;
            case '3': year = "Junior"; break;
            case '4': year = "Senior"; break;
            default:
                System.out.println("Invalid Input"); return;
        }

        System.out.println(major + " " + year);
    }

}
