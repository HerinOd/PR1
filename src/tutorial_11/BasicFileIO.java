package tutorial_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    public static void main(String[] args) {
        File myFile = new File("hello.txt");
        //Write
        try (PrintWriter printWriter = new PrintWriter(myFile);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Edit file: ");
            String input = scanner.nextLine();
            printWriter.print(input);
            System.out.println("File edited successfully");
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot edit file.");
        }

        //Read
        try (Scanner scanner = new Scanner(myFile)) {
            while (scanner.hasNext()){
                String messageFromFile = scanner.nextLine();
                System.out.println(messageFromFile);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }
    }
}
