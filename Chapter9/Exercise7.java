package Chapter9;

import java.util.Arrays;

public class Exercise7 {

	public static void main(String[] args) {
		String s1 = "cat";
	    String s2 = "tac";
	    boolean isAnagram = false;
	    if (s1.length() == s2.length()) {
	        char[] s1AsChar = s1.toCharArray();
	        char[] s2AsChar = s2.toCharArray();
	        Arrays.sort(s1AsChar);
	        Arrays.sort(s2AsChar);
	        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
	        
	    }
	    System.out.println(isAnagram);
	}
	
}
