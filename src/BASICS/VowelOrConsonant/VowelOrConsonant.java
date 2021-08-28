package BASICS.VowelOrConsonant;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		System.out.println("Enter any Character");

		Scanner sc=new Scanner(System.in);

		char ch=sc.next().charAt(0);

		if(ch=='A' ||ch=='a' ||ch=='E' ||ch=='e' ||ch=='I' ||ch=='i' ||ch=='O' ||ch=='o' ||ch=='U' ||ch=='u' )
		{
		System.out.println("VOWEL");
		}

		else
		{
		System.out.println("CONSONANT");
		}
	}

}
