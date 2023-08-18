package Lec3;

import java.util.Scanner;

public class pattern8m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space1=0;
		int space2=n-2;
		while(row<=n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			int j=1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
			}
			if(row==n/2+1) {
				System.out.print("  ");
			}else {
				System.out.print("* ");
			}
			
			if(row<=n/2) {
				space1++;
				space2-=2;
			}else {
				space1--;
				space2+=2;
			}
			row++;
			System.out.println();
		}

	}

}
