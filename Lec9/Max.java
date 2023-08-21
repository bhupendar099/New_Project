package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {2,3,1,17,5,8};
        System.out.println(maxx(arr));
	}
	public static int maxx(int []arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
