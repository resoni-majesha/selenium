package week1.day2;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
	
	int num = 153;
	
	int orgNum = num;
	
	int sum = 0;
	
	while(num > 0) {
		
		// To add each number use mod operator
		
		int rem = num % 10; // 3 
		sum = sum + (rem*rem*rem); // 0+27=27
		
		num = num/10; // 15 
	}
	
	if(sum == orgNum) {
	System.out.println(orgNum+" -"+"is an armstrong number");
	}
	
	else {
		System.out.println(orgNum+" -"+"is not an armstrong number");	
	}
		
	}
}
