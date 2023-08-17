package Lec2;
import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space1=n-1;
		int space=n-2;
		while(row<=n) {
//			int k=1;
//			while(k<=space1) {
//				System.out.print(" ");
//				k++;
//			}
			
		
		if(row==1||row==n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
		}else {
			System.out.print("* ");
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			System.out.print("* ");
		}
		System.out.println();
		row++;
		space1--;

				
		}
			
	
		
		
		
			
			
		
			
	
		

	}

}
