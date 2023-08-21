package Lec9;

public class Swap_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {10,20,30,40,50};
        System.out.println(arr[0]+" "+arr[1]);
        Swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);
	}
	public static void Swap(int []arr) {
		int c=arr[0];
		arr[0]=arr[1];
		arr[1]=c;
	}

}
