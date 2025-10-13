package tutorial_05;

public class Exercise3 {
    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0)
                return "The equation has infinitely many solutions.";
            else
                return "The equation has no solution.";
        }
        else
            return "The solution is x: " + (int) ((-b / a) * 100);
    }
    public static void main(String[] args) {
        System.out.println(solveLinearEquation(5, -10));
        System.out.println(solveLinearEquation(0, 0));
        System.out.println(solveLinearEquation(0, 7));
        System.out.println(solveLinearEquation(-3, 9));
    }
}
