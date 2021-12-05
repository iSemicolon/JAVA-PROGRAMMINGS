package STRINGS.AddDigit;

import java.util.Scanner;

public class AddDigitsInString {

	public static void main(String[] args) {

		System.out.println("Enter The String");
		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();

		int sum=0;
		for (int i=0;i<str.length();i++)
		{

			char ch=str.charAt(i);

			if (ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}

		System.out.println("Sum of  Digits:"+sum);
	}	

}


