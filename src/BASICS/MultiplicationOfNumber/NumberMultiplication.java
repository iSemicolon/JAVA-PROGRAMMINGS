package BASICS.MultiplicationOfNumber;
import java.util.Scanner;

/*
 
7*1 = 7
7*2 = 14
7*3 = 21
7*4 = 28
7*5 = 35
7*6 = 42
7*7 = 49
7*8 = 56
7*9 = 63
7*10 = 70
 
 */
public class NumberMultiplication {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		int mul=1;
		System.out.println("Multiplications Table of "+n);
		for(int i=1; i<=10; i++) {
			System.out.println(n+"*"+i+" = "+(n*i));
		}
	}

}
