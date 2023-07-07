package week1.day2;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		// If you write code for sum, consider the initial value as 0
		// If you write code for product, consider the initial value as 1
		
		int num = 123;
		int sum = 0;
		
		while(num > 0) {
			
			// To add each number use mod operator
			
			int rem = num % 10; // 3 
			sum = sum + rem; // 0+3=3
			
			num = num/10; // 12 
		}
			
		System.out.println("Sum of Digits:" +sum);
		}
	}	


