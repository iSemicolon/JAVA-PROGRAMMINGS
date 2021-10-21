package BASICS.ReverseOfNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();

		int rev=0;

		do
		{
			int r=n%10;
			rev=rev*10 +r;
			n=n/10;

		}
		while(n!=0);

		System.out.println("Reverse Number is: "+rev);

	}


}
