package STRINGS.CountUpperCaseLowerCase;

import java.util.Scanner;

public class CountUpperCaseLowerCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The String ");
		String str=sc.nextLine();

		int upperCount=0,lowerCount=0;

		for(int i=0;i<str.length();i++)
		{

			char ch=str.charAt(i);
			if(ch >='A' && ch<='Z')
			{
				upperCount++;
			}

			else if(ch>='a' && ch<='z')
			{
				lowerCount++;
			}
		}

		System.out.println("Upper Case Count:"+upperCount);
		System.out.println("Lower Case Count:"+lowerCount);
	}



}
