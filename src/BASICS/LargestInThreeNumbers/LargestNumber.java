package BASICS.LargestInThreeNumbers;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Enter Three Integer");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is Large Value");
		}

		else if (b > c) {
			System.out.println(b + " is Large Value");
		}

		else {
			System.out.println(c + " is Large Value");
		}

	}

}
