package Lec13;

import java.util.Scanner;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			int k=sc.nextInt();
		
//           int k=3;
//           int n=126;
           System.out.println(Kthroot(k,n));
        
	}
	}
	public static long Kthroot(int k, long n) {
		long lo=1;
		long hi=n;
		long ans=0;
		while(lo<=hi) {
			long mid=lo+(hi-lo)/2;
			if(Math.pow(mid,k)<=n) {
				ans=mid;
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		return ans;
	}
}
