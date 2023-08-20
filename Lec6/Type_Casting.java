package Lec6;

public class Type_Casting {

	public static void main(String[] args) {
		char ch='b';
		char ch1='0';
		System.out.println((int)(ch));
		ch++; //ch=(char)(ch+1);
		System.out.println((int)(ch1));
		ch1++;
		System.out.println((int)(ch1));
	}

}
