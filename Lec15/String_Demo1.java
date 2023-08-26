package Lec15;

import java.util.Scanner;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();  //using for taking user input 
		String str="hello";
		String str1="hello";
		String str2= new String("hello");
		String str3= new String("hello");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str==str2);//address compare using(==)
		System.out.println(str==str1);
		System.out.println(str1.equals(str3));//content compare  using (.equals)
        String str4=str+"bye";
        System.out.println(str4);
        System.out.println(str4.length());
	}

}
