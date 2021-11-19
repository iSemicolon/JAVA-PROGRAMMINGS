package BASICS.DigitalNumberConversions.OctalToDecimal;

import java.util.Scanner;

/*
 
 Octal=31
 Decimal=25
 
 */

public class OctalToDecimal {

	public static void main(String[] args) {

		System.out.println("Enter the Octal Number");
		Scanner sc=new Scanner(System.in);
		int oct= sc.nextInt();
		int dec=0, pow=1;
		
		
		do {
			int rem=oct%10;
			dec=dec+(rem*pow);
			pow=pow*8;
			oct=oct/10;
		}
		
		while(oct!=0) ;
		
		System.out.println("Decimal Number : "+dec);
	}

}
