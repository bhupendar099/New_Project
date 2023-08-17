package Lec1;

public class post_dec_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int c=a++ - 8 + a-- + a++;
		
         int d= a++ - ++a - 89 + --a + ++a - a--;
		int e= ++a +9- a++  - ++a ;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
