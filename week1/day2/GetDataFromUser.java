package week1.day2;

import java.util.Scanner;

public class GetDataFromUser {

	public static void main(String[] args) {
		
		// To get data from the user from console, use a class called scanner, scan is the object 
		
		Scanner scan = new Scanner(System.in); // To get the input from the console, pass the argument System.in
 
		System.out.println("Enter the first number");
		
		int x = scan.nextInt();
		
		// Using the scan object, scan.nextInt is a method to read integer value. Save it in a integer
		
		System.out.println("Enter the second number");
		
		int y = scan.nextInt();
		
		System.out.println(x+y); // Add both numbers and get the result
		
		System.out.println("Enter your name");
		
		String str = scan.next(); // If name is Reso Maje, next() will print Reso. It won't print name after space
		
		// scan.nextLine() will print name after the space also. Reso Maje
		
		System.out.println(str);
	}

}
