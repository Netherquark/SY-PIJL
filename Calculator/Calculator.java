/*
Name: Soham Kulkarni
PRN: 23070126129
Batch: SY-AIML B 2023-27
*/

package Calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    public static double performArithmetic(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operator provided.");
                return Double.NaN;
        }
    }

    public static int[] generateFibonacci(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int calculateMode(int[] arr) {
        if (arr.length == 0) return 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static double calculateMean(int[] arr) {
        if (arr.length == 0) return 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
