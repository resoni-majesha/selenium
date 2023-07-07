package week1.day2;

public class PrintMoreThanTwoDuplicates {

	public static void main(String[] args) {
		
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,14}; 

         // {14,12,13,11,15,0,18,16,17,19,0,0,20,0}
		
		for (int i = 0; i < arr.length; i++) { 
			
			int count = 1; 
			
		for (int j = i+1; j < arr.length; j++) { 
				
			if(arr[i] == arr[j]) { 
					
				count++;
				
				arr[j] = 0; // If 14 is replaced with 0, then 2nd&3rd 14 won't be compared with others numbers again
					
				}
				
			}
			
		    if (count > 1 && arr[i] != 0) { // arr[i] != 0,because 0 won't be compared with other numbers
		    	
		    	System.out.println(arr[i]);
		    	 
		    } 
		
		}
		
	}

}
		

