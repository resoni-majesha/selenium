package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 13;
		boolean prime = true;
		
		for (int i = 2; i < 13; i++) {
			
			if(n%i == 0) {
				
				prime = false;
				break;
			}
		}
		
		System.out.println(prime);
	}

}
