package STRINGS.ReverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s1=sc.nextLine();

		char ch[]=s.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
