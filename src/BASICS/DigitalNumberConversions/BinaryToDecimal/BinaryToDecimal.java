package BASICS.DigitalNumberConversions.BinaryToDecimal;

import java.util.Scanner;

/*
 Binary=11001
 Decimal=25
 */
public class BinaryToDecimal {

	public static void main(String[] args) {
		
		System.out.println("Enter the Binary Number");
		Scanner sc=new Scanner(System.in);
		int bin= sc.nextInt();
		int dec=0, pow=1;
		
		
		do {
			int rem=bin%10;
			dec=dec+(rem*pow);
			pow=pow*2;
			bin=bin/10;
		}
		
		while(bin!=0) ;
		
		System.out.println("Decimal Number : "+dec);
		
		

	}

}
