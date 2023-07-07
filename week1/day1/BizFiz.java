package week1.day1;

public class BizFiz {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 25; i++) {
					
			if(i%3 == 0 && i%7 == 0) {
				// To join 2 different datatype, use concatenation operator
				System.out.println(i+" bizfiz");
				
			} else if(i%3 == 0) {
				
				System.out.println(i+" biz");
				
			} else if(i%7 == 0){
				
				System.out.println(i+" fiz");
			} else {
				
				System.out.println(i+" is not divisibile by 3 or 7");
			}
			
		}
		
	}

}
