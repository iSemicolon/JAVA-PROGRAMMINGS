package BASICS.PerfectNumber;

import java.util.Scanner;
/*
 * Input=28= 1+2+4+7+14=28(Perfect)
 * Input=12=1+2+3+4+6=16(Not Perfect)
 */
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);

		int a= sc.nextInt();

		int i=1;
		int sum=0;


		while(i<=a/2)
		{

			if(a%i==0)
			{
				sum=sum+i;
			}

			i++;
		}

		if(sum==a)
		{
			System.out.println(a+" is a Perfect Number");
		}

		else
		{
			System.out.println(a+" is  Not a Perfect Number");
		}

	}



}
