package STRINGS.DigitCount;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {

		System.out.println("Enter String");

		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			char a=str.charAt(i);

			if(a>='0' && a<='9')
			{
				count++;
			}
		}
		System.out.println("Numerical Digit Present: "+count);
	}
}





