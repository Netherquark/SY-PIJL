//package Calculator;

import java.util.*;

public class Main {
    
    public static void main(String args[]){

	int[] input_numbers;
	
	Input in = new Input();
	input_numbers = in.input();
	
	int sum = input_numbers[0] + input_numbers[1];
	
	System.out.println("Sum is: " + sum);

    }

}
