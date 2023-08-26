package Lec16;

public class Print_substring_of_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="8643";
		printSubstring( s);

	}
	public static void printSubstring(String s) {
		for( int len=1; len<=s.length(); len++) {
			for(int j=len; j<=s.length(); j++) {
				int i=j-len; 
				System.out.println(s.substring(i,j));
			
			}
		
		
		}
	}

}
