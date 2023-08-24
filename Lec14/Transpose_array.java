package Lec14;

import java.util.Scanner;

public class Transpose_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][]arr=new int [N][M];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
         Trans(arr);
         for(int i=0; i<arr.length; i++) {
 			for(int j=0; j<arr[0].length; j++) {
 				System.out.print(arr[i][j]+"  ");
 			}
 			System.out.println();
 		}
	}
	public static void Trans(int [][]arr) {
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
