package tutorial_05;

public class Exercise1 {
    public static String sumDigits(int num) {
        if (num < 0)
            return "Invalid Argument: num should not be negative";
        else if (num > 10_000)
            return "Input Mismatch: num should be an integer between 0 and 10000";
        if (num == 10_000)
            return "" + 10;

        int sum = 0;
        int inputNumber = num;
        while (inputNumber > 0) {
            int lastDigit = inputNumber % 10;
            sum += lastDigit;

            inputNumber = inputNumber / 10;
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(-9));
        System.out.println(sumDigits(10001));
        System.out.println(sumDigits(234));
        System.out.println(sumDigits(10000));
    }

}
