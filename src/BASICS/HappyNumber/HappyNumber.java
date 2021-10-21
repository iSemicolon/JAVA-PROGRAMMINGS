package BASICS.HappyNumber;

import java.util.Scanner;

/*
 * Input=13=1^2+3^2=10=1^2+0^2=10(Happy Number)[upto single number]
 */
public class HappyNumber {
	
	static boolean isHappyNumber(int n) {
		int sum;
		
		while(n>9) {
			sum=0;
			while(n!=0) {
				int r=n%10;
				sum=sum+(r*r);
				n=n/10;
			}
			
			n=sum;
		}
		
		return n==1 || n==7;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean a=isHappyNumber(n);
		
		if(a) {
			System.out.println(n+" is Happy Number");
		}
		
		else {
			System.out.println(n+" is Not Happy Number");
		}

	}

}
