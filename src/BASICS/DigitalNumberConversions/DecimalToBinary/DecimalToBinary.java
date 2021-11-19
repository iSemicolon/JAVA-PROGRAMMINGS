package BASICS.DigitalNumberConversions.DecimalToBinary;

import java.util.Scanner;

/*
Decimal=25
Binary=11001

*/

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println("Enter the Decimal Number");
		Scanner sc=new Scanner(System.in);
		int dec= sc.nextInt();
		String bin="";
		
		
		do {
			int rem=dec%2;
			bin=rem+bin;
			dec=dec/2;
			
		}
		
		while(dec!=0) ;
		
		System.out.println("Binary Number : "+bin);
	}
	

}
