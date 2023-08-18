package Lec3;
import java.util.*;

public class pattern27m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int num=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
			     i++;
			     
			}
			int j=1;
			int count=1;
			while(j<=num) {
				System.out.print(count+" ");
				if(j<(num/2)+1) {
					count++;
				}else {
					count--;
				}
				j++;
			}
			row++;
			System.out.println();
			num+=2;
			space--;
		}
		

	}

}
