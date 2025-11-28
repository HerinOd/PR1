package tutorial_07.activity5;

import java.util.*;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new password: ");
        String password = scanner.nextLine();

        System.out.println(passwordStrength(password));
    }

    public static String passwordStrength(String password) {
        int score = 0;
        if (password.length() > 12)
            score += 2;
        else if (8 <= password.length())
            score++;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;
        for (char character : password.toCharArray()) {
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character))
                    hasUpperCase = true;
                else if (Character.isLowerCase(character))
                    hasLowerCase = true;
            }
            else if (Character.isDigit(character))
                hasDigit = true;
            else
                hasSymbol = true;
        }
        if (hasUpperCase) score++;
        if (hasLowerCase) score++;
        if (hasDigit) score++;
        if (hasSymbol) score++;

        if (score >= 5) return "Strength: " + score + " (strong)";
        else if (score >= 3) return "Strength: " + score + " (medium)";
        else return  "Strength: " + score + " (weak)";
    }
}
