package Lec2;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n+4;
		int space=0;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			
			}
			row++;
			System.out.println();
			star--;
			space+=2;
			
		}

	}

}
