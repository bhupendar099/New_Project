package Lec4;
import java.util.*;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
		 int num=n%10;
		 sum=sum+num;
		 n=n/10;
		
		}
		 System.out.println(sum);

	}

}
