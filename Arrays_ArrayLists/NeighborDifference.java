/*
 * Name: Soham Kulkarni
 * PRN: 23070126129
 * Batch: SY-AIML B 2023-27
 *
 */

 package Arrays_ArrayLists;

 public class NeighborDifference {

    /**
     * Finds the index of the first element in the pair of neighboring numbers
     * with the smallest absolute difference.
     *
     * @param arr The input array of integers.
     * @return The index of the first number in the pair with the smallest difference.
     *         Returns -1 if the array has less than two elements.
     */
    public static int findMinDifferencePairIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements to form a pair.
        }
        
        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);  // Initialize with the first adjacent pair.
        
        // Loop through the array to check each adjacent pair.
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static void main(String[] args) {
        // Sample array for demonstration.
        int[] arr = {5, 3, 8, 10, 15, 12};
        
        // Find the index of the neighboring numbers with the smallest difference.
        int index = findMinDifferencePairIndex(arr);
        
        // Display the result.
        if (index != -1) {
            System.out.println("The neighboring numbers with the smallest difference are: " 
                + arr[index] + " and " + arr[index + 1]);
            System.out.println("The index of the first number is: " + index);
        } else {
            System.out.println("Array does not have enough elements to form a pair.");
        }
    }
}
