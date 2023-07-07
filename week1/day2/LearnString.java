package week1.day2;

public class LearnString {

	public static void main(java.lang.String[] args) {
		
		// String is a sequence of characters
		// String is a predefined class in Java
		// It is a non - primitive data type
		// Don't provide the predefined class name in string
		// 2 ways to declare a string (i) string literal (ii) new keyword
		
		// Declare using string literal
		
		String str1 = "Welcome";
		
		String str2 ="Welcome";
		
		// When you declare same values for 2 variables using string literal,
		// then Java will check the Sting constant pool in the memory
		// Whenever we declare the string using string literal, 
		// the value will be stored in a memory called string constant pool
		// When you declare another variable with the same value, 
		// then it won't create another value in the same string constant pool,
		// it will point str2 to the already existing value welcome 
		// By using string literal, memory will be effectively used. There won't be any memory wastage
		// If the same value is already existing in the string constant pool, it won't create duplicate value
		// But it will point another variable str2 to the existing value
		// Refer img in the location C:\Users\DELL\Documents\Selenium
		
		// To understand this, let's create another variable
		// Declare using new keyword
		
		String str3 = new String("Welcome");
		
		// Even though the values are same (welcome), it is created in another memory space called heap memory
		// Memory address of string literal welcomes and memory address of heap memory welcome will be different
		
		System.out.println(str1 == str2); // To compare the memory address of variables, it will print true
		
		System.out.println(str1 == str3); // It will print false, because str1 & str2 are in different memory location

		// To compare the values of 2 strings, there is a method called "equals()"
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));// Both will return true, because the values are equal
		
		// Above methods are used only for strings and not for primitive data types
		
		String str4 ="WELCOME";
		
		System.out.println(str1.equals(str4)); // It will print false, because it's case sensitive
		
		// To ignore the case sensitive there is a method called "equalsIgnoreCase()"
		
		System.out.println(str1.equalsIgnoreCase(str4));
		
		// To concatenate 2 strings there is a method called 
		
		System.out.println(str1.concat(str3));
		
		// '+' operator is used to to concatenate 2 different data types
		
		int num = 123;
		System.out.println(str1 + num);
		
		// If you put variable inside " ", it will be considered as literal string and will be printed as such 
		
		System.out.println(str1 + "str4");
		
		// To check whether a variable contains strings of another variable, use the method contains (partial match)
		// If str1 is lower case and str5 is upper case, then it will print false. Both values must be same case
		
		String str5 = "COME";
		
		System.out.println(str4.contains(str5)); // It will print true, because it's a whole string
		
		String str6 = "WEL123";
		
		System.out.println(str4.contains(str6)); // It will print false. It will look for the whole string(EL,COME)
		
		String str7 = "Welcome"; // Each character in string will be saved with index. Index starts with 0,1,2,3,4..
		
		// To get the number of characters in string, use the method length().
		
		// In array, length is the property, but in string length is the method
		
		System.out.println(str7.length());
		
		System.out.println(str7.length() - 1); // To get the index of last character
		
		System.out.println(str7.charAt(3)); // To get the single character from the array
		
		System.out.println(str7.charAt(str7.length() - 1)); // To get the last character
		
		/* // To print the string in reverse order - emocleW, use reverse for loop
		
		for (int i = str7.length() - 1; i >= 0; i--) {
			
			System.out.println(str7.charAt(i)); 
			
		} */
		
		// Another method to print string in reverse order
		
		char[] charArray = str7.toCharArray(); // First, convert string into array using a method toCharArray()
		
		// toCharArray() is used to convert string to char[]
		
		for (int i = charArray.length - 1; i >= 0; i--) { // Then use reverse for loop
			
			System.out.println(charArray[i]);
		}
		
		System.out.println(str7.replace('e', 'x')); // To replace old character with new character
		
		System.out.println(str7.replace("e", "")); // To remove characters, change it to string and provide null val
			
		// To find the number of occurence of the character 'e'
		
		int orgLen = str7.length(); // Take the original length of str7 and save it in orgLen
		
		String stringWithoutE = str7.replace("e", ""); // Save the replaced string in stringWithoutE variable
		
		int lenAfterRemovingE = stringWithoutE.length(); // Take the len of the string after replacing e and save it in lenAfterRemovingE
		
		System.out.println(orgLen - lenAfterRemovingE); // Print subtracted value of both the lengths
		
		// To remove the numbers from the given string, use the method replaceAll() - used to do RegEx
		
		// Here,(regex , replacement), regex(regular expression), give the number from [0-9] & replacement as null
		
		System.out.println(str7.replaceAll("[0-9]", ""));
		
		// To remove the letters, both upper case & lower case, use the RegEx
		
		System.out.println(str6.replaceAll("[a-zA-Z]", ""));
		
		System.out.println(str7.substring(3));// To get the partial portion of the string (Welcome), use substring()
		
		// It will print come, i.e., from index 3 to end - come
		
		System.out.println(str7.substring(2,6)); // It will print from the index 2 to 5 - lcom
		
		// To split each word in a sentence, use the method split()
		
		String str8 = "Welcome to java session";
		
		String[] words = str8.split(" "); // Give RegEx as space. If it finds a space, it will split the words 
		
		// Split method will return a string of array, so save it in String data type
		
		// It will split all the words and will put it in a  array called words
		
		// To print only the word java, provide the index as 2
		
		System.out.println(words[2]);
		
		String[] words1 = str8.split("e"); // Whenever it finds e, it will split the words
		
		System.out.println(words1[3]); // ssion
		
		// If we give words1[2], it will print - to java s
		
		}
		
	}

