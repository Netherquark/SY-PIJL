/*
 * Name: Soham Kulkarni
 * PRN: 23070126129
 * Batch: SY-AIML B 2023-27
 *
 */

 package Arrays_ArrayLists;

 import java.util.Scanner;

 public class EvenOdd {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Prompt user to enter the number of elements.
         System.out.print("Enter the number of elements: ");
         int n = scanner.nextInt();
         
         // Temporary array to store all input numbers.
         int[] numbers = new int[n];
         
         // Accept the numbers from the user.
         System.out.println("Enter " + n + " integers:");
         for (int i = 0; i < n; i++) {
             numbers[i] = scanner.nextInt();
         }
         
         // First pass: count even and odd numbers.
         int countEven = 0, countOdd = 0;
         for (int num : numbers) {
             if (num % 2 == 0) {
                 countEven++;
             } else {
                 countOdd++;
             }
         }
         
         // Declare two arrays based on counts.
         int[] even = new int[countEven];
         int[] odd = new int[countOdd];
         
         // Populate the even and odd arrays.
         int evenIndex = 0, oddIndex = 0;
         for (int num : numbers) {
             if (num % 2 == 0) {
                 even[evenIndex++] = num;
             } else {
                 odd[oddIndex++] = num;
             }
         }
         
         // Display the even numbers.
         System.out.print("Even numbers: ");
         for (int e : even) {
             System.out.print(e + " ");
         }
         System.out.println();
         
         // Display the odd numbers.
         System.out.print("Odd numbers: ");
         for (int o : odd) {
             System.out.print(o + " ");
         }
         System.out.println();
         
         scanner.close();
     }
 }
 