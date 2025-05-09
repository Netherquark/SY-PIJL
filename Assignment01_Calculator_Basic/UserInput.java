import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    // Reads two integers from the user
    public int[] readTwoIntegers() {
        int[] operands = new int[2];
        System.out.print("Enter the first number: ");
        operands[0] = scanner.nextInt();
        System.out.print("Enter the second number: ");
        operands[1] = scanner.nextInt();
        return operands;
    }

    // Reads a single integer from the user with a custom prompt
    public int readSingleInteger(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Reads an array of integers from the user
    public int[] readIntegerArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integers:");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}

