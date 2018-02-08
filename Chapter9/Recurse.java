package Chapter9;

public class Recurse {
	
	// first: returns the first character of the given String
	public static char first(String s) {
		return s.charAt(0);
	}
	
	// last: returns a new String that contains all but the 
	// first letter of the given String
	public static String rest(String s) {
		return s.substring(1, s.length());
	}
	
	//length: returns the length of the given String
	public static int length(String s) {
		return s.length();
	}
	
	public static void printString(String s) {
		if (length(s) > 0) {
			System.out.println(first(s));
			printString(rest(s));  
		}
	}
	
	public static void printBackwards(String s) {
		if (length(s) > 1) {
			printBackwards(rest(s));
		}
		System.out.println(first(s)); 
	}
	
	public static String reverseString(String s) {
		if (length(s) == 1) {
			return s; 
		}
		else {
			String reversed = reverseString(rest(s)) + first(s); 
			return reversed; 
		}
	}
	
	public static void main(String[] args) {
		String s = "coffee";
		System.out.println(first(s));
		System.out.println(rest(s));
		System.out.println(length(s));
		
		System.out.println(); 
		printString(s); 
		System.out.println(); 
		printBackwards(s);
		System.out.println();
		System.out.println(reverseString(s)); 
	}
}


