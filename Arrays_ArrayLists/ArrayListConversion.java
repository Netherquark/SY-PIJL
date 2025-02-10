/*
 * Name: Soham Kulkarni
 * PRN: 23070126129
 * Batch: SY-AIML B 2023-27
 *
 */

 package Arrays_ArrayLists;
 
 import java.util.ArrayList;
 import java.util.Arrays;
 
 public class ArrayListConversion {
     public static void main(String[] args) {
         // --- Array to ArrayList Conversion ---
         // Use an Integer array (wrapper type) because generics do not work with primitives.
         Integer[] numArray = {1, 2, 3, 4, 5};
         
         // Convert array to ArrayList using Arrays.asList() and then create a modifiable ArrayList.
         ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(numArray));
         
         // Display the ArrayList.
         System.out.println("Converted ArrayList from array: " + arrayList);
         
         // --- ArrayList to Array Conversion ---
         // Create an ArrayList with some String values.
         ArrayList<String> list = new ArrayList<>();
         list.add("Apple");
         list.add("Banana");
         list.add("Cherry");
         
         // Convert the ArrayList to an array.
         String[] strArray = list.toArray(new String[list.size()]);
         
         // Display the array.
         System.out.print("Converted array from ArrayList: ");
         for (String s : strArray) {
             System.out.print(s + " ");
         }
         System.out.println();
     }
 }
 