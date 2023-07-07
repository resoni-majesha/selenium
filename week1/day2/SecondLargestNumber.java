package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		// Sort the array
		
		Arrays.sort(data); // 2,3,4,6,7,11
		
		// TO find index for the 2nd largest number
		
		int len = data.length - 2;
		
		System.out.println(data[len]);

	}

} 
