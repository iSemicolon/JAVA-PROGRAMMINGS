package BASICS.ArmstrongNumber;

import java.util.Scanner;
/*
 * Input-1221
 * Output- Armstrong
 * 
 * Input-122
 * Output- Not Armstrong
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();
		int num=n;

		int rev=0;

		do
		{
			int r=n%10;
			rev=rev*10 +r;
			n=n/10;

		}
		while(n!=0);


		if(rev==num) {

			System.out.println(num+" is Armstrong");
		}

		else {
			System.out.println(num+" is Not Armstrong");
		}

	}
}
