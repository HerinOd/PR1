package practicing_place.week_04;

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
        String[] names;
        int[] scores;

        System.out.print("Number of the students: ");
        numberOfStudents = scanner.nextInt();
        names = new String[numberOfStudents];
        scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + i + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Student " + i + "'s score: ");
            scores[i] = scanner.nextInt();

        }
    }

}
