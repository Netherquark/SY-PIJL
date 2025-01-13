//package Calculator;

import java.util.*;

public class Input {
    
	int[] input(){
	
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int first_number = scan.nextInt();
		System.out.println("Enter Second Number:");
		int second_number = scan.nextInt();

		int[] numbers = new int[2];
		numbers[0] = first_number;
		numbers[1] = second_number;
		
		return numbers;
    }
}
