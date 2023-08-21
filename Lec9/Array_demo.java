package Lec9;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=9;
        int []arr=new int [5];
        
        System.out.println(a);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        arr[0]=10;
        arr[1]=20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        int []other=arr;
        System.out.println(other );
       
	}

}
