import java.util.ArrayList;
import java.util.List;

/**
 * Provides various operations on arrays and ArrayLists.
 */
public class ArrayProcessor {

    /**
     * Reads numbers from the user and separates them into even and odd lists.
     */
    public void separateEvenAndOddNumbers() {
        int[] inputNumbers = UserInput.readIntegerArray(5);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Separate numbers into even and odd lists
        for (int number : inputNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    /**
     * Finds the pair of neighboring numbers in an array with the smallest absolute difference.
     * Prints the index of the first number in the pair.
     */
    public void findSmallestNeighborDifference() {
        int[] inputNumbers = UserInput.readIntegerArray(5);

        if (inputNumbers.length < 2) {
            System.out.println("At least two numbers are required.");
            return;
        }

        int minDifference = Math.abs(inputNumbers[1] - inputNumbers[0]);
        int minIndex = 0;

        // Find the smallest difference and its index
        for (int i = 1; i < inputNumbers.length - 1; i++) {
            int difference = Math.abs(inputNumbers[i + 1] - inputNumbers[i]);
            if (difference < minDifference) {
                minDifference = difference;
                minIndex = i;
            }
        }

        System.out.println("Smallest difference is between elements at indices " +
                minIndex + " and " + (minIndex + 1) +
                " (values: " + inputNumbers[minIndex] + ", " + inputNumbers[minIndex + 1] + ")");
    }

    /**
     * Converts an array to an ArrayList and vice versa, then displays both.
     */
    public void convertArrayAndArrayList() {
        int[] inputNumbers = UserInput.readIntegerArray(5);

        // Convert array to ArrayList
        List<Integer> numberList = new ArrayList<>();
        for (int number : inputNumbers) {
            numberList.add(number);
        }
        System.out.println("Converted ArrayList: " + numberList);

        // Convert ArrayList back to array
        int[] convertedArray = numberList.stream().mapToInt(Integer::intValue).toArray();
        System.out.print("Converted back to array: ");
        for (int number : convertedArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

