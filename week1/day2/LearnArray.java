package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		// Array is container to store multiple data of a same datatype
		// i.e., if you want to save 2 or more integers into same variable, use array
		// Array is used to organize the data in a better way
		// To save int x = 10, int y = 20 in a single variable, use array
		// Another way to declare an array, int[] a = {10,20};
		// We cannot change the array size at run runtime
		
		// int input = 4;
		// int[] num = new int[input]
		
		int[] num = new int[4]; // Max limit for the array has to be declared initially
		
		// If you want to store a data inside the array, it should be saved based on index
		// Index starts with 0, first data index is always 0
		
		num[0] = 10; // Array index starts with 0
		num[1] = 20;
		num[2] = 30; // Max Limit (or) Length - 1
		num[3] = 40;
		 
		// If you add 4th value num[3] & if you run it, it will throw an error as "ArrayIndexOutofBoundsException"
		// i.e, It goes beyond the boundary
		
		System.out.println(num.length); // Length is a property(variable) in array
		                                // It is used to find the length of the array
		                                // Num is the array
		
		System.out.println(num.length - 1); // Last data index should be length -1
		
		System.out.println(num[1]); // To retrieve a single data from the array
		
		System.out.println(num[0]); // To retrieve the first data from the array
		
		System.out.println(num[num.length - 1]); // To retrieve the last data from the array
		
		// To get all the data, i.e, 10, 20, 30, 40 use for loop
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
		}
		
		// To get all the data in reverse, i.e, 40,30,20,10 
		
		for (int i = num.length - 1; i >= 0; i--) {
			
			System.out.println(num[i]);
			
		/*int[] num = {45,95,55}; // 45,55,95
		
		Arrays.sort(num);
		
		// To sort the numbers in ascending order, we use a class called array
		
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);
		
		// To sort the numbers in descending order, first arrange it in descending order, then use reverse for loop
		
        for (int i = num.length - 1; i >= 0; i--) {
			
			System.out.println(num[i]);*/
			
		}
		
		
	}

}
