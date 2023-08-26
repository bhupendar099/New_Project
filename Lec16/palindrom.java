package Lec16;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitiN";
		System.out.println(Palindrom( s));
		

	}
	
	public static boolean Palindrom(String s) {
		int i=0; 
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
