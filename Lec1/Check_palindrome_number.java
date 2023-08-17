package Lec1;

import java.util.Scanner;

public class Check_palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(palindrome( number));

	}
	public static boolean palindrome(int number) {
		int originalnumber= number;
		int reversenumber=0;
		
		while(number!=0) {
			int remender=number%10;
			reversenumber=reversenumber*10+remender;
			number=number/10;
			
		}
		if(reversenumber==originalnumber) {
			return true;
		}else {
			return false;
		}
		
	}

}
