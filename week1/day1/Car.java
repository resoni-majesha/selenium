package week1.day1;

public class Car {
	
	//purple words -> means keywords in Java
	
	//Declare some variables
	//Variables/attributes are the data or information about the car
	//Brand -> Swift
	//Color -> Black
	//Registration -> 1234
	//Old -> True
	//Diesel -> 32.1
	//Price -> 500000
	
	//Data Types
	String brand = "Swift";
	String color = "Black";
	int registrationNumber = 1234;
	boolean isOld = true;
	float diesel = 32.1f;
	long price = 500000;
	short age = 5;

	
	/* To define methods
	 * 4 pillars
	 * 1)Access Modifiers -> public, private, protected, package(default)
	 * 2)Return type
	 * 3)Method Name
	 * 4)Input Arguments
	 */
	
	/* Facebook/Apartment
	 * Public -> Anyone can access -> Security gate
	 * Private -> Only you can access -> Phone in house / FB password
	 * Protected -> You and parents/ kids can access -> Bedroom / cycle / car / TV / Age
	 * Package / Default -> Only the people that are associated to can access -> Gym, Pool, Theatre, Terrace, Park, Group posts
	 */
	
	/* Return type -> Primitive data type / Class
	 * Did you had lunch? Boolean
	 * What's the lunch you had today? Class -> String
	 * How many glasses of water did you had today? short /int
	 * What time did you take your last food? Class -> DateTime
	 * How is your Java class going? void (No responses back)
	 */
	
	/* Methods -> Actions (What am I going to do)
     * washCar
     * applyBrake
     * soundHorn
     */
	
	/* Input arguments are optional (Not mandatory)
	 * Add numbers and what is the output.
	 * Do you need an input? Yes
	 * What input do you need?
	 * 1) How many numbers to add add?
	 * 2)What data type of them?
	 * 
	 * How many people attend this session? What to return? -> int
	 * How many people on mobile? (No response) -> Void
	 * 
	 * Can you find out if the person by name if present?
	 * Input: Resoni
	 * Output: Boolean (True)
	 */ 
	
     // Car Method -> Anyone can access
	 // Return the price of the car
	
	 public int getPrice() {
		return 900000;
		
	 }
	 
	 public boolean isCarWashed() {
		 return true;
	 }
	 
	 private void driveYourself() {
		 System.out.println("Hello..!! How are you?");
	 }
	 
	 // What if I've multiple cars
	 // Audi -> 1 -> White
	 // Ferrari -> 2 -> Grey
	 // Maruti -> 3 -> Red
	 // Maruti -> 4 -> Brown
	 
	 public String getColor(int whichCar) {
		 
		 // Based on the car number, the color need to be returned
		 // How do I write condition based coding
		 // Java -> there are 2 ways to write condition -> if else or switch case
		 // if else is easier and preferred
		 // == comparison operator, = asignment operator
		 
		 if(whichCar == 1) {
			 return "White";
		 } else if(whichCar == 2) {
			 return "Grey";
		 } else if(whichCar == 3) {
			 return "Red";
		 } else {
			 return "Brown";
		 }
		 
	 }
	 
	 // Main method -> Method that act as the execution entry point
	 // Like main door in our house
	 // How many main door do you have in your house? 1
	 
	 public static void main(String[] args) {
		 System.out.println("I'm Majee");
		 
		 // ClassName ref = new ClassName();
		 // ref.methodName();
		 
		 Car myCar = new Car();
		 System.out.println(myCar.getColor(1));
		 System.out.println(myCar.getPrice());
		 myCar.driveYourself(); //As it is void, it cannot be stored anywhere. So syso can't  be used
		 
		
	}
	 
	 // Main method is used to run the java application
	 // How many main methods can I have? 1 (Java doesn't have duplicate main methods)
	 // Should I have static keyword in main method? Yes
	 // Signature of the main method cannot be changed
	 
	 // static -> Singular reference -> It cannot be changed -> Fixed..!!
	 
	 // Use of main method
	 // Main method is used to call another method to run the code
	 // It can have its own code that you wanted to execute.
	 
	 // How to call methods outside the main method
	 // Syntax: 1) Create a memory reference (object)
	 //         ClassName ref = new ClassName();
	 //         2) Call one of the method or variable
	 //         ref.methodName();
	 //         ref.variableName();
	 
	 // Q1) If one of your friend is calling you after a long time
	 //      -> Will you store his/her number in your phone?
	 // What is the benefit of storing? You can text, call, whatsapp him later
	 // 1) Store the Java class information into the memory.
	 // 2) Using the stored information, you can access the variables / methods.
	 
	 
	 
	 
	 
	 
	 
	 
}
    