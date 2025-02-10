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
         
         System.out.print("Enter the number of elements: ");
         int n = scanner.nextInt();
         
         int[] numbers = new int[n];
         
         System.out.println("Enter " + n + " integers:");
         for (int i = 0; i < n; i++) {
             numbers[i] = scanner.nextInt();
         }
         
         int countEven = 0, countOdd = 0;
         for (int num : numbers) {
             if (num % 2 == 0) {
                 countEven++;
             } else {
                 countOdd++;
             }
         }
         
         int[] even = new int[countEven];
         int[] odd = new int[countOdd];
         
         int evenIndex = 0, oddIndex = 0;
         for (int num : numbers) {
             if (num % 2 == 0) {
                 even[evenIndex++] = num;
             } else {
                 odd[oddIndex++] = num;
             }
         }
         
         System.out.print("Even numbers: ");
         for (int e : even) {
             System.out.print(e + " ");
         }
         System.out.println();
         
         System.out.print("Odd numbers: ");
         for (int o : odd) {
             System.out.print(o + " ");
         }
         System.out.println();
         
         scanner.close();
     }
 }
 