import java.util.Arrays;

public class Calculator {

    // Adds two integers and returns the sum
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Subtracts the second integer from the first and returns the result
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    // Multiplies two integers and returns the product
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    // Divides the first integer by the second and returns the quotient
    // Throws ArithmeticException for division by zero
    public int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }

    // Prints the Fibonacci sequence up to n numbers
    public void printFibonacciSequence(int count) {
        int previous = 0, current = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < count; i++) {
            System.out.print(previous + " ");
            int next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println();
    }

    // Returns the mode of the given array
    public int calculateMode(int[] numbers) {
        int mode = numbers[0], maxCount = 0;
        for (int candidate : numbers) {
            int count = 0;
            for (int element : numbers) {
                if (element == candidate) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = candidate;
            }
        }
        return mode;
    }

    // Returns the mean (average) of the given array
    public double calculateMean(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return (double) sum / numbers.length;
    }
}

