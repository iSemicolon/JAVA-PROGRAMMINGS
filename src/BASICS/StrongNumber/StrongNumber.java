package BASICS.StrongNumber;

import java.util.Scanner;
/*
 * Input=145 =1!+4!+5!=1+24+120(Strong)
 * Input=113 =1!+1!+3!=8(Not Strong)
 */
public class StrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter The Number");

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int m=n;
		int sum=0;

		while(n!=0)
		{
			int r=n%10;

			int fact=1;
			int i=1;

			while(i<=r)
			{
				fact=fact*i;
				i++;
			}

			sum=sum+fact;

			n=n/10;
		}

		if(sum==m)
		{
			System.out.println(m+" is a Strong Number");
		}

		else
		{
			System.out.println(m+" is Not a Strong Number");
		}

	}

}
