package practicing_place.week_05;

public class SolveLinearEquation {
    public static void main(String[] args) {
        System.out.println(solveLinearEquation(-3, 9));
    }

    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0)
                return "The equation has infinitely many solutions.";
            else
                return  "The equation has no solution.";
        }
        return "The solution is x = " + (-b / a);
    }

}
