package Lec15;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="bye";
		System.out.println(str+str1);// In heap
		System.out.println(str.concat(str1));// In heap
		System.out.println(str+"bye");// In heap
		System.out.println("bye"+str);// In heap
		System.out.println("hello"+str1);// In heap
		System.out.println("bye"+"bye");// In pool
		String s=("hello"+"bye00");
		String s1=("hello"+"bye");
		System.out.println(s==s1);
		String d="abcde">="abcdef";
		String d1="abcdef";
		System.out.println("abcde">="abcdef");
	}

}
 