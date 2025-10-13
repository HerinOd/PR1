package tutorial_05;

public class Exercise2 {
    public static double calculateBMI(double weight, double height) {
        double bmi;
        if (weight <= 0 || height <= 0 || height >= 3) {
            bmi = -1.0;
        } else {
            bmi = weight / (height * height);
        }
        return Math.round(bmi * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("Your BMI is: " + calculateBMI(70, 1.75));
        System.out.println("Your BMI is: " + calculateBMI(-70, 1.75));
        System.out.println("Your BMI is: " + calculateBMI(70, 175));
    }

}
