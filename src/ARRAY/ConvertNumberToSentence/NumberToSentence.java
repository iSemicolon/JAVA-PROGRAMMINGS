package ARRAY.ConvertNumberToSentence;

import java.util.Scanner;
/*
 *I/P- 43456
 *o/p= Fourty Three Thousand Four Hundred  Fifty Six
 */

public class NumberToSentence {



	static void sen(int x, String st)
	{
		String one[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN",
				"ELEVEN","TWELEVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};

		String two[]={"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};



		if(x<20)
		{
			System.out.print(one[x] + " ");
		}

		else 
		{
			System.out.print(two[x/10] +" "+one[x%10] +" ");
		}

		if (x!=0)
		{
			System.out.print(st+ " ");
		}

	}


	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");

		int n=sc.nextInt();

		sen(n/10000000,"CRORE"); // 841652509/10000000=84
		sen((n/100000)%100,"LAKH");// 841652509/100000=8416%100=16
		sen((n/1000)%100,"THOUSAND");//841652509/1000=841652%100=52
		sen((n/100)%10,"HUNDRED");//841652509/100=8416525%10=5
		sen((n%100),"");

	}



}
