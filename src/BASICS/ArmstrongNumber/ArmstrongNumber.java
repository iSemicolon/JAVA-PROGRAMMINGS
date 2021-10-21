package BASICS.ArmstrongNumber;

import java.util.Scanner;

/*
 * Input=153 =1^3+5^3+3^3=153(Armstrong)
 * Input=113 =1^3+1^3+3^3=29(Not Armstrong)
 * 
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int rem,res,sum=0;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();
		int num=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}

		if(sum==num)
		{
			System.out.println(num+" is Armstrong Number");
		}
		else
		{
			System.out.println(num+" is Not Armstrong");
		}

	}

}
