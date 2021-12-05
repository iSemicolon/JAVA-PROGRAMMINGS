package STRINGS.UpperCaseLowerCase;

import java.util.Scanner;

/*
A=65
Z=90
a=97
Z=122
0=48
9=57
 */
public class UpperCaseLowerCase {

	public static void main(String[] args) {

		System.out.println("Enter The String");
		Scanner sc=new Scanner(System.in);

		String st=sc.nextLine();

		char chLower[]=st.toCharArray();
		char chUpper[]=st.toCharArray();

		for (int i=0;i<st.length();i++)
		{

			if (chUpper[i]>='A' && chUpper[i]<='Z')
			{

				chUpper[i]=(char)(chUpper[i]+32); // ch[i]+32=65+32=97

			}

			if (chLower[i]>='a' && chLower[i]<='z')
			{
				chLower[i]=(char)(chLower[i]-32);
			}


		}

		String upperString=new String(chUpper);
		String lowerString=new String(chLower);

		System.out.println("Lower Conversion:"+lowerString);
		System.out.println("Upper Conversion:"+upperString);

	}

}
