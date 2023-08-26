package Lec16;

public class Compare_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ajay";
		String s1="komal";
		System.out.println(Compare( s,  s1));
		System.out.println(s.compareTo(s1));
		

	}
	public static int Compare(String s, String s1) {
		int n =Math.min(s.length(), s1.length());
		for(int i=0; i<n; i++) {
			if(s.charAt(i)>s1.charAt(i)) {
				return s.charAt(i)-s1.charAt(i);
			}else if (s.charAt(i)<s1.charAt(i)) {
				 return s.charAt(i)-s1.charAt(i);
			}
		}
	return	s.length()-s1.length();
	}

}
