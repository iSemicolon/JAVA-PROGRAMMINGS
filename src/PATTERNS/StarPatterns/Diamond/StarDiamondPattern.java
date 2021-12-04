package PATTERNS.StarPatterns.Diamond;

import java.util.Scanner;

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


 */
public class StarDiamondPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row ");
		int n=sc.nextInt(); 
		//declare for loop for print first pyramid
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=n-row;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row*2-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		} 
		//declare for loop for print reverse pyramid
		for(int row=n-1;row>0;row--)
		{
			for(int space=1;space<=n-row;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row*2-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
