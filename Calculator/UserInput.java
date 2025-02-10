/*
Name: Soham Kulkarni
PRN: 23070126129
Batch: SY-AIML B 2023-27
*/
package Calculator;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int getOperationChoice() {
        System.out.println("Select Operation:");
        System.out.println("1. Arithmetic Operations (+, -, *, /)");
        System.out.println("2. Fibonacci Sequence");
        System.out.println("3. Array Statistics (Mode, Mean)");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static double[] getArithmeticInputs() {
        double[] numbers = new double[2];
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    public static char getArithmeticOperator() {
        System.out.print("Enter operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static int getFibonacciInput() {
        System.out.print("Enter the number of Fibonacci terms: ");
        return scanner.nextInt();
    }

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
