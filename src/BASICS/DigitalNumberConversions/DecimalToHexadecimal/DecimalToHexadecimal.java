package BASICS.DigitalNumberConversions.DecimalToHexadecimal;

import java.util.Scanner;

/*
 Decimal: 1513
 HexaDecimal: 5E9
 */

public class DecimalToHexadecimal {

	public static void main(String[] args) {

		System.out.println("Enter the Decimal Number");
		Scanner sc=new Scanner(System.in);
		int dec= sc.nextInt();
		String hexa="";
		
		do {
			
			int rem=dec%16;
			
			if(rem<10) {
				hexa=rem+hexa;
			}
			
			else if(rem==10) {
				hexa="A"+hexa;
			}
			
			else if(rem==11) {
				hexa="B"+hexa;
			}
			
			else if(rem==12) {
				hexa="C"+hexa;
			}
			
			else if(rem==13) {
				hexa="D"+hexa;
			}
			
			else if(rem==14) {
				hexa="E"+hexa;
			}
			
			else if(rem==15) {
				hexa="F"+hexa;
			}
			
			dec=dec/16;
		}
		while(dec!=0);
		
		System.out.println("HexaDecimal Number: "+hexa);
	}

}
