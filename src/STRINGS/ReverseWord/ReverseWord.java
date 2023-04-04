package STRINGS.ReverseWord;

import java.util.Scanner;

/*

  input: PALASH AND SAMANTA
  output: HSALAP DNA ATNAMAS


 */
public class ReverseWord {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();

		/*
		"RAMA AND LAXMANA"
		"0123456789,10,11,12,13,14,15"

		"AMAR DNA ANAMXAL"

		logic: find first word to end word index of a word check length also otherwise it count infinite time
		while(ch[i]!=' ')
		{
		i++; // here extra index increase at last index
		}

		print element of last index to first index of particular word

		while (j<=k)
		{
		str=str+ch[k];
		k--;
		}


		now print space after insert last element of a word 

		str=str+" ";
		but here in last word last element insert it also print space so, count the length then insert

		 */

		String str="";
		for(int i=0;i<ch.length;i++)
		{
			int beg=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++; //0-4, i=4// 5-8//9-16
			}

			int end=i-1; //3//15
			while(beg<=end)//3-0//15-9
			{
				str=str+ch[end];

				end--;
			}

			if (i<ch.length)
			{
				str=str+" ";
			}

		}
		System.out.println("Reverse Word:"+str);
	}
}




