package STRINGS.PrintFirstLastLetter;

import java.util.Scanner;

public class FirstLastLetter {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String");
		String s=sc.nextLine();

		System.out.println("First Letter :"+s.charAt(0));
		System.out.println("Last Letter :"+s.charAt(s.length()-1));
	}
}
