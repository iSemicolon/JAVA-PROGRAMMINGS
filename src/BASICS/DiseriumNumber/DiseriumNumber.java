package BASICS.DiseriumNumber;

import java.util.Scanner;

/*
 * Input: 89=8^1+9^2=89(Diserium)
 * Input: 175=1^1+7^2+5^3=175(Diserium)
 * Input: 98=9^1+8^2=73(Not Diserium)
 * 
 */
public class DiseriumNumber {

	static boolean isDiserium(int num) {
		int t=num, sum=0;
		int c=counter(t);
		
		while(num!=0) {
			int r=num%10;
			sum=sum+powC(r,c);
			c--;
			num=num/10;
		}
		
		return sum==t;
	}
	
	static int powC(int b, int d) {
		int pro=1;
		while(d!=0) {
			pro=pro*b;
			d--;
		}
		return pro;
	}
	
	static int counter(int u) {
		int count=0;
		while(u!=0) {
			count++;
			u=u/10;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int a=sc.nextInt();
		boolean r=isDiserium(a);
		
		if(r) {
			System.out.println(a+" is Diserium Number");
		}
		
		else {
			System.out.println(a+" is not Diserium Number");
			
		}

	}

}
