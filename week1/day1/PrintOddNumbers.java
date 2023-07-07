package week1.day1;

import java.util.Iterator;

public class PrintOddNumbers {
	
	public static void main(String[] args) {
		
		// Print from 1 to 100
		// Loops - Repeat the same code for multiple times
		// Types of loop -> for, foreach, while, do while
		// for loop should be used when you use the same code for given times
		// If the number of iteration is known, then use for loop
		// How many times to iterate -> 100 times
		
		// for loop syntax
		
		// for (int i = 1; i < 101; i++) {
		//	System.out.println(i);
		// }
		
		// Print odd numbers from 1 to 100
		
		for (int i = 1; i < 101; i++) {
			if(i%2 == 1)
			System.out.println(i);	
		}
		
		// break; break is the keyword to come out of the for loop
		
		// How do I know if the given number is odd?
		// 3 -> odd or even? odd
		// Any number divided by 2, if the remainder is 1 -> odd
		// If the reminder is 0, even 	
		// + - * / (quotient) % (mod -> remainder)	
			
		
	}

}
