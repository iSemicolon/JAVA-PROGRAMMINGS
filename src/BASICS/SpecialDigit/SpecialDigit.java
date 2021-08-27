package BASICS.SpecialDigit;

import java.util.Scanner;

/*
 * SPECIAL DIGIT
  39=(3+9)+(3*9)
 */

public class SpecialDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Digit Number");
		int num = sc.nextInt();

		int d1 = num / 10;
		int d2 = num % 10;

		int sum = d1 + d2 + (d1 * d2);

		if (num == sum) {
			System.out.println(num + " Is Special Two Digit Number");
		} else {
			System.out.println(num + " Is Not Special Two Digit Number");
		}
	}

}
