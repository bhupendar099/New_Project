package Lec3;
import java.util.*;

public class pattern33m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int space=n-1;
		int num=n;
		while(row<=n) {
			
			int j=1;
			int count=n;
			while(j<=num) {
				if(j+row==n+1 ||j==row) {
					System.out.print("* ");
				}else {
					System.out.print(count+" ");
				}
				
				
				count--;
				
				j++;
			}
	
			row++;
			System.out.println();
			
		}
		
		

	}

}
