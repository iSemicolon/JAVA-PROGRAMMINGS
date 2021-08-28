package BASICS.SmallestInThreeNumbers;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {

		System.out.println("Enter Three Integer");

		Scanner sc=new Scanner(System.in);


		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();


		if(a<b && a<c)
		{
		System.out.println("Smallest Number is :"+a);
		}

		else if(b<c && b<a)
		{
		System.out.println("Smallest Number is :"+b);
		}

		else

		{
		System.out.println("Smallest Number is :"+c);}
		}
	

}
