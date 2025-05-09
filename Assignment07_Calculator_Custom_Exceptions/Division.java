/**
 * Performs division operation with exception handling for division by zero.
 */
public class Division {
    public static void performDivision(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        double quotient = dividend / divisor;
        System.out.println("Result = " + quotient);
    }
}

