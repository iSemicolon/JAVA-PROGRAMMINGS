package BASICS.NumberOfDigits;

import java.util.Scanner;

/*
 i/p= 123
 o/p= Number of Digits: 3
 */
public class CountDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		
		do {
			n=n/10;
			count++;
		}
		
		while(n!=0) ;
		
		System.out.println("Number of Digits: "+count);
		

	}

}
