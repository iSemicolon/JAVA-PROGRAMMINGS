package STRINGS.FirstWordUpper;

import java.util.Scanner;

/*

 input: i Ammm palaSh
 output: I Ammm Palash

 */

public class FirstWordUpperCase {


	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);

		String st=sc.nextLine();

		char ch[]=st.toCharArray();

		/*
		find first character of words the replace 
		2 way
		1. 1st charcter of everey word  can have space " i am palash "

		ch[i]=' '&& ch[i-1]!=' '
		2. 1st character of every word don't have space "i am palash " 

		 */

		for(int i=0;i<ch.length;i++)
		{

			if ((i==0 &&ch[i]!=' ')||(ch[i]!=' ' && ch[i-1]==' '))
			{

				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}

			}
			else if (ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}

		}

		String s=new String(ch);

		System.out.println("Converted String:"+s);

	}

}


