package tutorial_05;

public class Exercise5 {
    public static String checkISBN(String isbnString) {
        if (isbnString == null || isbnString.isEmpty())
            return "Invalid ISBN: Empty or argument that is too short.";
        if (isbnString.length() != 9) {
            if (isbnString.length() < 9)
                return "Invalid ISBN: Empty or argument that is too short.";
            else
                return "Invalid ISBN: The argument is too long.";
        }
        for (int i = 0; i < isbnString.length(); i++) {
            char ch = isbnString.charAt(i);
            if (!Character.isDigit(ch)) {
                if (ch == ' ')
                    return "Invalid ISBN: Space within the argument.";
                if (Character.isLetter(ch))
                    return "Invalid ISBN: Non-numeric argument.";
                else
                    return "Invalid ISBN: Special characters are not allowed.";
            }
        }
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbnString.charAt(i));
            sum += digit * (i + 1);
        }

        int checksum = sum % 11;
        String lastDigit;
        if (checksum == 10) {
            lastDigit = "X";
        } else {
            lastDigit = String.valueOf(checksum);
        }
        return isbnString + lastDigit;
    }

}

