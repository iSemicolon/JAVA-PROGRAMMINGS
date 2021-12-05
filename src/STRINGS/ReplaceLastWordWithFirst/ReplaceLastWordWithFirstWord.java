package STRINGS.ReplaceLastWordWithFirst;

import java.util.Scanner;

/*
 input: halasp dnA aamantS
 output:palash And Samanta 
 */
public class ReplaceLastWordWithFirstWord {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		/*
		java is easy
		0123456789,10,11

		find fisrst and last index
		if((i==0 &&ch[i]!=' ') ||(ch[i]!=' ' && ch[i-1]==' '))
		{
		int j=i;//0
		while (i<ch.length && ch[i]!=' ')//0-4
		{
		i++; //5
		}

		then swap
		 */

		for(int i=0;i<ch.length;i++)
		{


			if((i==0 &&ch[i]!=' ') ||(ch[i]!=' ' && ch[i-1]==' '))
			{
				int j=i;//0
				while (i<ch.length && ch[i]!=' ')//0-4
				{
					i++; //5
				}

				int k=i-1;
				char t= ch[k];
				ch[k]=ch[j];
				ch[j]=t;
			}

		}
		String s=new String(ch);
		System.out.println(s);
	}


}


