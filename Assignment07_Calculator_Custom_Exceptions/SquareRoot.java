/**
 * Performs square root operation with exception handling for negative input.
 */
public class SquareRoot {
    public static void performSquareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot take square root of a negative number.");
        }
        double squareRoot = Math.sqrt(number);
        System.out.println("Result = " + squareRoot);
    }
}

