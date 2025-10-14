package practicing_place.week_05;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println(solveQuadraticEquation(1, -3, 2));
    }

    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0)
                return "The linear equation has infinite solution.";
            else
                return "The linear equation has no solution";
        }
        return "The solution to the linear equation is x = " + (-b / a);
    }

    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0)
            return solveLinearEquation(b, c);

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant == 0)
            return "The equation has one real root: x = " + (-b / (2 * a));
        else if (discriminant > 0)
            return String.format("The equation has two real roots: x1 = %.2f, x2 = %2.2f",
                    (-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a));
        else
            return "The equation has no real roots.";
    }

}
