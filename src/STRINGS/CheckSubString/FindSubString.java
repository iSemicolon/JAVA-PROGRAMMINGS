package STRINGS.CheckSubString;

import java.util.Scanner;

public class FindSubString {

	static boolean isSubStr(String str, String subStr)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=subStr.toCharArray();

		for(int i=0;i<ch1.length;i++)
		{
			int j=0;
			int k=i;
			while (j<ch2.length &&(ch1[k]==ch2[j]&& k<ch1.length))
			{
				j++;
				k++;
			}

			if (j==ch2.length)
			{
				return true;
			}
		}

		return false;

	}
	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		System.out.println("Enter Substring");
		String subStr=sc.nextLine();

		boolean bool=isSubStr(str,subStr);

		if(bool) {
			System.out.println("Substring Present");
		}

		else {
			System.out.println("Substring Not Present");
		}

	}
	}


