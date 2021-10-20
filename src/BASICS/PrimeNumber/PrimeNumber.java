package BASICS.PrimeNumber;

/*
 * prime number: 2,3
 * non prime number: 4, 6
 * 
 */
import java.util.Scanner;

class PrimeNumber {
	public static void main(String ...b)
	{

		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();

		/* no need to check 1 or itself */

		int i=2;

		while(i<=n/2)
		{

			if(n%i==0)
			{
				break;
			}

			i++;
		}

		if(i>n/2)
		{
			System.out.println(n+" is Prime number");
		}

		else
		{
			System.out.println(n+" is Not Prime number");
		}


	}
}
