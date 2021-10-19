package BASICS.LeapYear;

import java.util.Scanner;
/*
 * Leap Year-1996
 * Not Leap Year-1997
 */

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter Year");


		Scanner sc=new Scanner(System.in);

		int a= sc.nextInt();

		if(  a%400==0 ||(a%4==0 && a%100!=0) )
		{

		System.out.println(a+" is Leap Year");
		}

		else
		System.out.println(a+" is Not Leap Year");

	}

}
