package tutorial_04.exercise;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 999:");
        for (int num = 100; num <= 999; num++) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

