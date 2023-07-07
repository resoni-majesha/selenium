package week1.day2;

public class LearnJumpStatements {
	
	public static void main(String[] args) {
		
		// Print 1 2 three 4 5, but print 3 in words
		// Jump Statements -> continue, break, return
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("Three");
				// continue; // Stop the current iteration and continue with the next iteration
				break; // Stop the iterations and comes out of the loop
			}
			
			System.out.println(i);
			
		}
		
	}

}
