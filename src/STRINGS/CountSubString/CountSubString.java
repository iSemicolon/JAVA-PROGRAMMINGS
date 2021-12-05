package STRINGS.CountSubString;

import java.util.Scanner;

public class CountSubString {


	static int  isCountSubStr(char ch1[], char ch2[])
	{

		int count =0;
		for(int i=0;i<ch1.length;i++)
		{
			int j=0;
			int k=i;//1
			while ( j<ch2.length && k<ch1.length && (ch1[k]==ch2[j])  ) //1-8
			{
				j++; //1-8
				k++;//2-9//9
			}


			if(j==ch2.length)
			{
				i=k-1;//8
				count ++;
			}

		}

		return count;
	}


	public static void main(String args[])
	{
		System.out.println("Enter String");

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();

		System.out.println("Enter Sub String");
		String s2=sc.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();

		int c=isCountSubStr(ch1,ch2);
		System.out.println("Sub String Count:"+c);
	}

}


