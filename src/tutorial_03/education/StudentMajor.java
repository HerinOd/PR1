package tutorial_03.education;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String input = scanner.nextLine();

        char major = input.charAt(0);
        char year = input.charAt(1);

        String studentsMajor;
        String studentsYear;

        switch (major) {
            case 'M':
                studentsMajor = "Mathematics";
                break;
            case 'C':
                studentsMajor = "Computer Science";
                break;
            case 'I':
                studentsMajor = "Information Technology";
                break;
            default:
                studentsMajor = "Invalid";
                break;
        }

        switch (year) {
            case '1':
                studentsYear = "Freshman";
                break;
            case '2':
                studentsYear = "Sophomore";
                break;
            case '3':
                studentsYear = "Junior";
                break;
            case '4':
                studentsYear = "Senior";
                break;
            default:
                studentsYear = "Invalid";
                break;
        }

        if (studentsMajor.equals("Invalid") || studentsYear.equals("Invalid"))
            System.out.println("Invalid input");
        else
            System.out.println(studentsMajor + " " + studentsYear);
    }
}
