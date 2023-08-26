package Lec15;

public class Spiral_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3,4},
				{5,6,7,8},
				{13,14,15,16},
				{18,19,20,21}};
		Spiral(arr);

	}
	public static void Spiral(int [][]arr) {
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int te= arr.length*arr[0].length;
		int count=0;
		while(count<te) {
		for(int i=minc; i<=maxc &&count<te; i++) {
			System.out.print(arr[minr][i]+" ");
			count++;
		}
		minr++;
		for(int i=minr; i<=maxr &&count<te; i++) {
			System.out.print(arr[i][maxc]+" ");
			count++;
	    }
		maxc--;
		for(int i=maxc; i>=minc &&count<te; i--) {
			System.out.print(arr[maxr][i]+" ");
			count++;
		}
		maxr--;
		for(int i=maxr; i>=minr &&count<te; i--) {
			System.out.print(arr[i][minc]+" ");
			count++;
		}
		minc++;
//		for(int i=minc; i<=maxc; i++) {
//			System.out.print(arr[minr][i]+" ");
//		}
//		minr++;
//		for(int i=maxc; i>=minc; i--) {
//			System.out.print(arr[minr][i]+"  ");
//		}
	}
	} 
}
