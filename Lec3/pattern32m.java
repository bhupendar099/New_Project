package Lec3;

import java.util.Scanner;

public class pattern32m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int count=1;
		int num=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=num) {
				if(i%2==0) {
					System.out.print("* ");
				}else {
					System.out.print(count+" ");
				}
				i++;
			}
			if(row<n) {
				num+=2;
			}else {
				num-=2;
			}
			if(row<n) {
				count++;
			}else {
				count--;
			}
			
			
			System.out.println();
			row++;
			
			
		}

	}

}
