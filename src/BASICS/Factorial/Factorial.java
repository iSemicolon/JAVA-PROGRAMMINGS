package BASICS.Factorial;

import java.util.Scanner;
/*
 * 5!=1*2*3*4*5=5
 */

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1; 
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		
		if(n==0)
		{
			System.out.println("Factorial of 0 is 1");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
			
			fact= fact*i;
		   }
			System.out.println("Factorial of "+n+"  is :"+fact);
		}
	}

}
