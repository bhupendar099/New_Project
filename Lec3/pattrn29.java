package Lec3;

import java.util.Scanner;

public class pattrn29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int row=1;
         int space1=n-1;
         int space2=-1;
         while(row<=n) {
        	 int i=1;
        	 while(i<=space1) {
        		 System.out.print("  ");
        		 i++;
        		 
        	 }
        	 System.out.print(row+" ");
        	 int j=1;
        	 while(j<=space2) {
        		 System.out.print("0"+" ");
        		 j++;
        	 }
        	 if(row==1) {
        		 System.out.print("  ");
        	 }else {
        		 System.out.print(row+" ");
        	 }
        	 space1--;
        	 space2+=2;
        	 row++;
        	 System.out.println();
         }
	}

}
