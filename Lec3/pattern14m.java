package Lec3;

import java.util.Scanner;

public class pattern14m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row =1;
		int space =n-1;
		int star =1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				space--;
				star++;
			}else {
				space++;
				star--;
			}
			
			System.out.println();
			row++;
		}

	}

}
