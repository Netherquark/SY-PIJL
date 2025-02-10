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
         Integer[] numArray = {1, 2, 3, 4, 5};
         ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(numArray));
         System.out.println("Converted ArrayList from array: " + arrayList);
 
         ArrayList<String> list = new ArrayList<>();
         list.add("Apple");
         list.add("Banana");
         list.add("Cherry");
         
         String[] strArray = list.toArray(new String[list.size()]);
         System.out.print("Converted array from ArrayList: ");
         for (String s : strArray) {
             System.out.print(s + " ");
         }
         System.out.println();
     }
 }
 