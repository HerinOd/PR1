package practicing_place.week_05;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(10000));
    }

    public static String sumDigits(int num) {
        if (num < 0)
            return "Invalid Argument: num should not be negative";
        if (num > 10000)
            return "Input Mismatch: num should be an integer between 0 and 10000";
        if (num == 10000)
            return "10";
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        return "" + sum;
    }

}
