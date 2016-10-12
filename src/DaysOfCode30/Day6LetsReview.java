package DaysOfCode30;

import java.util.Arrays;
import java.util.Scanner;

public class Day6LetsReview {

//	
//	Sample Input
//
//	2
//	Rank
//	Sample Output
//
//	Hce akr
//	Rn ak
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 
		 Scanner s = new Scanner(System.in);
		 int numberOfInputs = s.nextInt();
		 
		 String[] inputs = new String[numberOfInputs];
		 String name = null;
		 for (int i = 1; i<= numberOfInputs ; i++ ) {
			 name = s.nextLine();
			 inputs[i-1] = name;
			 
		 }
		 for( String input : inputs) {
			  printOutput(input);
			  
			 
			 
		 }
		 
		 
	    }

	private static void printOutput(String input) {
	
		char[] charInput = new char[input.length()];
		charInput = input.toCharArray();
		
		char[] output1 = new char[input.length()];
		char[] output2 = new char[input.length()];
		
		
	    for(int i = 1; i< (charInput.length) ; i++ ) {
	    	if((i-1)%2 == 0 ) {
	    		output1[i-1] = charInput[i-1];
	    		
	    	}
	    	else {
	    		output2[i] = charInput[i];
	    		
	    	}
	    }
	    System.out.println(Arrays.toString(output1) + " " + Arrays.toString(output2));
	    
	    
		
		
		
	}
	
}
