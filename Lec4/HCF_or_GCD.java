package Lec4;

import java.util.Scanner;

public class HCF_or_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
//		n=divisor
		int m=sc.nextInt();
//		m=divident
		while(m%n!=0) {
			int rem =m%n;
			m=n;
			n=rem;
		}
		System.out.println(n);

	}

}
