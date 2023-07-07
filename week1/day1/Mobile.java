package week1.day1;

public class Mobile {
	
	/*
	 Mobile Name
	 Model
	 Memory
	 100 pixel camera or not?
	 Price with .dot
	 Symbol of the mobile(First character of your name)
	*/

	String brand = "iPhone";
	short model = 12;
	String memory = "256 GB";
	boolean is100Pixelcam = true;
	long price = 70000;
	char icon ='R';
	boolean s_100 = true;
	
	public int getPrice(int whatPrice) {
		
		if(whatPrice == 1) {
			return 10000;
		} else if(whatPrice == 2) {
			return 20000;
		} else if(whatPrice == 3) {
			return 30000;
		} else {
		return 40000;
		}
	}
	
	public String getModelName() {
		return "iPhone 12";
	}
	
	private void knowPerson() {
		System.out.println("That's my sister");
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		System.out.println(myMobile.getPrice(2));
		System.out.println(myMobile.getModelName());
		myMobile.knowPerson();
	}
}
