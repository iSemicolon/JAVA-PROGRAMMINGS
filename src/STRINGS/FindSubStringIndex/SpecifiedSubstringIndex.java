package STRINGS.FindSubStringIndex;

import java.util.Scanner;

public class SpecifiedSubstringIndex {

	static int isFirstIndexSubStr(String str, String subStr)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=subStr.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length &&(ch1[k]==ch2[j])  )
			{
				k++;
				j++;
			}

			if(j==ch2.length)
			{
				return i;
			}
		}
		return -1;
	}


	static int isLastIndexSubStr(String str, String subStr)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=subStr.toCharArray();
		int in=-1;
		for(int i=0;i<ch1.length;i++)
		{
			int j=0;
			int k=i;
			while(j<ch2.length && k <ch1.length &&(ch1[k]==ch2[j])  )
			{
				k++;
				j++;
			}

			if(j==ch2.length)
			{
				in=i;
				i=k-1;
			}
		}
		return in;
	}



	static int isSpecifiedIndexSubStr(String str, String subStr, int occ)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=subStr.toCharArray();
		int in;
		for(int i=0;i<ch1.length;i++)
		{
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length &&(ch1[k]==ch2[j])  )
			{
				k++;
				j++;
			}

			if(j==ch2.length)
			{
				occ--;
				if(occ==0)
				{
					return i;
				}
				i=k-1;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter String");

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		System.out.println("Enter Sub String");
		String subStr=sc.nextLine();


		int firstIndex=isFirstIndexSubStr(str,subStr);
		System.out.println("First Occurance Index:"+firstIndex);

		int lastIndex=isLastIndexSubStr(str,subStr);
		System.out.println("Last Occurance Index:"+lastIndex);

		System.out.println("Enter Sub String occurance number");
		int num=sc.nextInt();

		int specifiedIndex=isSpecifiedIndexSubStr(str,subStr,num);
		System.out.println("Specified Occurance Index:"+specifiedIndex);


	}


}


