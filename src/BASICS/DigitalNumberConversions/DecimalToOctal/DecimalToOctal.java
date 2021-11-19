package BASICS.DigitalNumberConversions.DecimalToOctal;

import java.util.Scanner;
/*
Decimal=25
Octal=31

*/

public class DecimalToOctal {

	public static void main(String[] args) {

		System.out.println("Enter the Decimal Number");
		Scanner sc=new Scanner(System.in);
		int dec= sc.nextInt();
		String oct="";
		
		
		do {
			int rem=dec%8;
			oct=rem+oct;
			dec=dec/8;
			
		}
		
		while(dec!=0) ;
		
		System.out.println("Octal Number : "+oct);
	}

}
