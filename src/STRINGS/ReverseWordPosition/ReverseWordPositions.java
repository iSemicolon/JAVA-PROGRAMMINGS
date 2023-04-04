package STRINGS.ReverseWordPosition;

import java.util.Scanner;

/*
input: PALASH AND SAMANTA
output: SAMANTA AND PALASH
 */
public class ReverseWordPositions {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();

		/*
		RAMA AND LAXMANA
		012345678910,11,12,13,14,15
		LAXMANA AND RAMA

		count the index number from last word from last index to last word 1st index (15-9)
		for(int i=ch.length-1;i>=0;i--)
		{

		while(i>=0 &&ch[i]!=' ')//15-9
		{
		i--; //15-8
		}

		print last word 1st index to last index
		while(k<=j) //9-15
		{
		str=str+ch[k];
		k++;
		}

		space print to check index value is zero or not otherwise when end process fast word first word added after that it print extra space
		if (i>=0)
		{
		str=str+" ";
		}
		 */


		String str="";

		for(int i=ch.length-1;i>=0;i--)
		{

			int end=i;
			while(i>=0 &&ch[i]!=' ')//15-9
			{
				i--; //15-8
			}

			int beg=i+1; // k=9

			while(beg<=end) //9-15
			{
				str=str+ch[beg];
				beg++;
			}
			if (i>=0)
			{
				str=str+" ";
			}
		}

		System.out.println("Reverse sentence :"+str);
	}

}


