package BASICS.EvenOdd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");

		Scanner sc =new Scanner(System.in);

		int a= sc.nextInt();

		if(a%2==0)
		{
		System.out.println(a+" is EVEN");
		}

		else
		{
		System.out.println(a+" is Odd");
		}

	}

}
