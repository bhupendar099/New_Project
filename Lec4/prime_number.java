package Lec4;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int count=0;
		while(i<n) {
			if(n%i==0) {
				count++;
			}
			i++;
           
		}
		if(count==0) {
			System.out.print("prime number");
		}else {
			System.out.print("not prime number");
		} 
		

	}

}
