/*
Name: Soham Kulkarni
PRN: 23070126129
Batch: SY-AIML B 2023-27
*/

package Calculator;
import java.util.Scanner;

public class UserInput {
    // Scanner instance for reading user input
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Displays the main menu and returns the user’s operation choice.
     *
     * @return an integer representing the selected operation.
     */
    public static int getOperationChoice() {
        System.out.println("Select Operation:");
        System.out.println("1. Arithmetic Operations (+, -, *, /)");
        System.out.println("2. Fibonacci Sequence");
        System.out.println("3. Array Statistics (Mode, Mean)");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    /**
     * Prompts the user to input two numbers for arithmetic operations.
     *
     * @return a double array containing two numbers.
     */
    public static double[] getArithmeticInputs() {
        double[] numbers = new double[2];
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    /**
     * Prompts the user to input an arithmetic operator.
     *
     * @return a character representing the operator.
     */
    public static char getArithmeticOperator() {
        System.out.print("Enter operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    /**
     * Prompts the user for the number of Fibonacci terms.
     *
     * @return an integer representing the number of Fibonacci terms.
     */
    public static int getFibonacciInput() {
        System.out.print("Enter the number of Fibonacci terms: ");
        return scanner.nextInt();
    }

    /**
     * Prompts the user to input an array of integers.
     *
     * @param prompt A message displayed to the user.
     * @return an array of integers provided by the user.
     */
    public static int[] getArrayInput(String prompt) {
        System.out.println(prompt);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
