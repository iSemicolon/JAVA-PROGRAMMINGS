package BASICS.MiddleValue;

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Three Number");

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();


		if((a<b && b<c) || ( a>b && b>c))
		{

		System.out.println("Middle Number  is: "+b);
		}

		else if( (a<b && c<a) || (a>b && c>a))
		{
		System.out.println("Middle Number  is: "+a);
		}

		else
		{
		System.out.println("Middle Number  is: "+c);
		}
	}

}
