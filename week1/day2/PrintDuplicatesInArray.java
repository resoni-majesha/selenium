package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// Logic: Take each value and compare with the remaining values in the array
		// When we find the match, we will increase the count
		// If the count is greater than one, then that number is a duplicate
		// Use nested for loop
		
		for (int i = 0; i < arr.length; i++) { // starting the index from 1st number
			
			int count = 1; // Initial value for count is 1
                           // Because any data in this array exist atleast one time 
                           // For number of occurence, take the count as 1
                           // When there is a match, increase the count
			               // Declared count inside 1st for loop, because
			               // Next time when we compare 12, we have to reset the count to 1 again
			
		for (int j = i+1; j < arr.length; j++) { // Starting the index from 2nd number
				                                     // Inner for loop is for the comparison
				
			if(arr[i] == arr[j]) { // 14 == 12
					
				count++;
					
				}
				
			}
		
		// Once the inner for loop is compared against all the data
			
		    if (count > 1) { // If the count is greater than 1, print the value 14,17,18
		    	
		    	System.out.println(arr[i]);
		    	 
		    } // Explanation: i = 0 -> 14, j = i+1 -> 12. So, 14 will be compared to each number in the array
		      // If arr[i] == arr[j], i.e, 14 == 14, then the count will be increased to 2
		      // If the count is greater than 1, then it will print the duplicate value
		      // Now count, 12 will be compared to all the numbers in the inner for loop array and it won't be printed
		      // And same for 13,11 etc.,
		
		}
		
	}

}