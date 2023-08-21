package Lec10;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void rotate(int []arr, int k) {
		 int n=arr.length;
		 k=k%n;
		 for(int j=1; j<=3;j++) {
		 int temp=arr[n-1];
		 for(int i=n-2; i>=0; i--) {
			 arr[i+1]=arr[i];
		 }
		 arr[0]=temp;
		 }
	}

}
