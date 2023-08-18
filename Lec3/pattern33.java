package Lec3;
import java.util.*;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int star=1;
				int space=n-1;
				int row =1;
				int num=n;
				while(row<=n) {
					int i=1;
					while(i<=space) {
						System.out.print("  ");
						i++;
						
					}
					int j=1;
					int val=num-row+1;
					while(j<=star) {
						if(row==1) {
							System.out.print(0);
							break;
						}else {
							if(j<=star/2) {
								System.out.print(val+" ");
								val++;
							}
							if(j==star/2+1) {
								val--;
								System.out.print("0"+" ");
							}
							
							if(j>star/2+1) {
								System.out.print(val+" ");
								val--;
							}
						
						}
						j++;
					}
					space--;
					star+=2;
					row++;
					System.out.println();
						
					
				}
				
							

	}

}
