package Lec4;

public class Fibonocci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=6;
		int i=1;
		int c=0;
		while(i<=n) {
			 c=a+b;
			a=b;
			b=c;
			i++;
			
		}
         System.out.println(a);
	}

}
