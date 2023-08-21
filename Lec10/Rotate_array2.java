package Lec10;

public class Rotate_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotate(int []arr, int k) {
		 int n=arr.length;
		 k=k%n;
		 //starting n-k element reverse
		 Reverse(arr,0,n-k-1);
		 //last k element reverse
		 Reverse(arr,n-k,n-1);
		 //hole array reverse
		 Reverse(arr,0,n-1);
}
public static void Reverse(int []arr,int i,int j) {
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
