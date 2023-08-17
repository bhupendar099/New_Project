package Lec2;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int num=n;
		while(row<=n) {
			int i=1;
			int count=n;
			while(i<=num) {
				if(i+row==n+1) {
					System.out.print("* ");
				}else {
					System.out.print(count+" ");
				}
				count--;
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
