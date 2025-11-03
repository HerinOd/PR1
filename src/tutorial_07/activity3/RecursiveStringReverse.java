package tutorial_07.activity3;

import java.util.*;

public class RecursiveStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("The reverse string is: " + reverseString(inputString));
    }

    public static String reverseString(String string) {
        if (string.isEmpty())
            return "";

        String lastCharacter = "" + string.charAt(string.length() - 1);
        String remainingString = string.substring(0,string.length() - 1);

        return lastCharacter + reverseString(remainingString);
    }

}
