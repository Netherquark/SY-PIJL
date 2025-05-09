/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Display the main menu and handle user selection
        System.out.println("===== Calculator Application =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mode of Array");
        System.out.println("7. Mean of Array");
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();

        switch (userChoice) {
            case 1:
                int[] addOperands = userInput.readTwoIntegers();
                System.out.println("Result: " + calculator.add(addOperands[0], addOperands[1]));
                break;
            case 2:
                int[] subtractOperands = userInput.readTwoIntegers();
                System.out.println("Result: " + calculator.subtract(subtractOperands[0], subtractOperands[1]));
                break;
            case 3:
                int[] multiplyOperands = userInput.readTwoIntegers();
                System.out.println("Result: " + calculator.multiply(multiplyOperands[0], multiplyOperands[1]));
                break;
            case 4:
                int[] divideOperands = userInput.readTwoIntegers();
                try {
                    System.out.println("Result: " + calculator.divide(divideOperands[0], divideOperands[1]));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 5:
                int fibonacciCount = userInput.readSingleInteger("Enter the number of Fibonacci numbers to print: ");
                calculator.printFibonacciSequence(fibonacciCount);
                break;
            case 6:
                int[] modeArray = userInput.readIntegerArray(5);
                System.out.println("Mode: " + calculator.calculateMode(modeArray));
                break;
            case 7:
                int[] meanArray = userInput.readIntegerArray(5);
                System.out.println("Mean: " + calculator.calculateMean(meanArray));
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
    }
}

