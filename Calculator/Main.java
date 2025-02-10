/*
Name: Soham Kulkarni
PRN: 23070126129
Batch: SY-AIML B 2023-27
*/
package Calculator;

public class Main {
    public static void main(String[] args) {
        int choice = UserInput.getOperationChoice();

        switch (choice) {
            case 1:
                double[] numbers = UserInput.getArithmeticInputs();
                char operator = UserInput.getArithmeticOperator();
                double arithmeticResult = Calculator.performArithmetic(numbers[0], numbers[1], operator);
                System.out.println("Arithmetic Result: " + arithmeticResult);
                break;

            case 2:
                int n = UserInput.getFibonacciInput();
                int[] fibonacciSequence = Calculator.generateFibonacci(n);
                System.out.print("Fibonacci Sequence: ");
                for (int num : fibonacciSequence) {
                    System.out.print(num + " ");
                }
                System.out.println();
                break;

            case 3:
                int[] array = UserInput.getArrayInput("Enter numbers for array statistics:");
                int mode = Calculator.calculateMode(array);
                double mean = Calculator.calculateMean(array);
                System.out.println("Array Statistics:");
                System.out.println("Mode: " + mode);
                System.out.println("Mean: " + mean);
                break;

            default:
                System.out.println("Invalid selection. Please run the program again.");
        }
    }
}