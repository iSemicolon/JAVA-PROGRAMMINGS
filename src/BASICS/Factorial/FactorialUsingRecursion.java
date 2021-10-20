package BASICS.Factorial;

import java.util.Scanner;
/*
 * 5!=1*2*3*4*5=120
 */




public class FactorialUsingRecursion {
	
	
	static int factorial(int a)
	{

	if(a==0||a==1)
		{
			return 1;
		}
		
		else
		{
			return a*factorial(a-1);
		}
	}

	public static void main(String[] args) {
		int n,res;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		res=factorial(n);
		System.out.println("Factorial of "+n+"  is :"+res);
		
		
	}

	
}
	


