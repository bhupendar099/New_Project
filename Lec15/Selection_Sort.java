package Lec15;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,1,8,4,7};
		Sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public static void Sort(int []arr) { 
		for(int i=0; i<arr.length; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				
			}
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
	}

}
