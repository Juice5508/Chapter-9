package Chapter9;

 

	import java.util.Arrays;
	 
	public class Exercise2
	{
	    public static void main(String[] args) {
	    System.out.println(Arrays.toString(letterHist("Hello")));
	         
	    }
	     
	    public static int[] letterHist (String s){
	       int[] hist = new int[25];
	       for (int i = 0;i<hist.length;i++){
	          hist[i] = findLetter(s,i);
	       }
	       return hist;
	    }
	     
	    public static int findLetter(String s,int i) {
	    int count = 0;
	       for (char letter: s.toCharArray()) {
	          if (letter == i + 97 || letter == i + 65 ) {
	             count++;
	          }
	       }
	       return count;
	    }
	}
