import java.util.Scanner;

/**
 * Utility class for user input operations.
 */
public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Reads an array of integers from the user.
     * @param arrayLength Number of integers to read.
     * @return Array of integers entered by the user.
     */
    public static int[] readIntegerArray(int arrayLength) {
        int[] numbers = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integers:");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}

