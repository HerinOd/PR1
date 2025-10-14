package practicing_place.week_05;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println("Your BMI is: " + calculateBMI(70, 1.75));
    }

    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0 || height >= 3)
            return -1.0;
        return weight / (height * height);
    }

}
