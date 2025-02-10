/*
 * Name: Soham Kulkarni
 * PRN: 23070126129
 * Batch: SY-AIML B 2023-27
 *
 */

 package Arrays_ArrayLists;

public class NeighborDifference {

    public static int findMinDifferencePairIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        
        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);
        
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
        int[] arr = {5, 3, 8, 10, 15, 12};
        
        int index = findMinDifferencePairIndex(arr);
        
        if (index != -1) {
            System.out.println("The neighboring numbers with the smallest difference are: " 
                + arr[index] + " and " + arr[index + 1]);
            System.out.println("The index of the first number is: " + index);
        } else {
            System.out.println("Array does not have enough elements to form a pair.");
        }
    }
}