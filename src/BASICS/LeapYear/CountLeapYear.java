package BASICS.LeapYear;

import java.util.Scanner;

public class CountLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Year");

		int a=sc.nextInt();
		int count=0;
		int i;

		for( i=1;i<=a;i++)

		{

		if(  (i%400==0)  ||  (  (i%4==0) && (i%100!=0) ) ) 

		{
		count++;
		}
		 
		}

		System.out.println("Number of Leap year is "+count);
		}
	

}
