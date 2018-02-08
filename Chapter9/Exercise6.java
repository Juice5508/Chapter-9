package Chapter9;



public class Exercise6 {

	public static boolean isDubloon(String s) {
		int[] hist = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			char curChar = s.toLowerCase().charAt(i);
			
			if ('a' <= curChar && curChar <= 'z') {
				hist[curChar-'a']++;
			}
		}
		
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] != 0 && hist[i] != 2) {
				return false;
			}
		} 
		return true;
	}
	public static void main(String[] args) {
	    System.out.println(isDubloon("Hello"));
	         
	    }
}


