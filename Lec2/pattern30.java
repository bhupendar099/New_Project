package Lec2;

public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int num=n;
		
		while(row<=n) {
			int i=1;
			int count=n;
			while(i<=num) {
				System.out.print(count+" "); 
				count--;
				i++;
				
			}
			row++;
			System.out.println();
			
		}

	}

}
