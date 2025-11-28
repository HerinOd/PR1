package tutorial_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveBlanks {
    public static void main(String[] args) {
        //File input
        File input = new File("input.txt");
        try (PrintWriter printWriter = new PrintWriter(input)) {
            printWriter.print("Welcome to the exciting  \n" +
                    "\n" +
                    "     \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "world of Java Programming\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " If you're eager to dive into software development using the power of Java, you're in the right  \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "   \n" +
                    "\n" +
                    "place. This course \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "      \n" +
                    "\n" +
                    " is designed for beginners, providing a comprehensive introduction to Java — a versatile and  \n" +
                    "\n" +
                    "powerful programming language. Whether you're a seasoned developer exploring new  \n" +
                    "\n" +
                    "technologies or a coding enthusiast taking your first steps into the programming world, this  \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "course will equip you with the skills and knowledge needed to kickstart your Java journey. Let's embark on this learning adventure together and unlock the potential of creating robust and engaging software applications! \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " ");
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found.");
            System.out.println(e.getMessage());
        }

        //File output
        File output = new File("output.txt");
        try (Scanner scanner = new Scanner(input);
             PrintWriter printWriter = new PrintWriter(output)) {
            while (scanner.hasNext()) {
                String outputMessage = scanner.nextLine() + "\n";
                if (!outputMessage.trim().isEmpty())
                    printWriter.print(outputMessage);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found.");
            System.out.println(e.getMessage());
        }
    }
}
