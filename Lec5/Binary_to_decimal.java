package Lec5;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;

			sum=sum+rem*mul;
			mul=mul*2;
			n=n/10;
					
		}
		System.out.println(sum);

	}

}
