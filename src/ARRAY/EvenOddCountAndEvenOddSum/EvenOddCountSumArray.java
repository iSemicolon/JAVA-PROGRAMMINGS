package ARRAY.EvenOddCountAndEvenOddSum;

import java.util.Scanner;

public class EvenOddCountSumArray {

	public static void main(String[] args) {

		System.out.println("Enter  array size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter Array Elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int evSum=0, evCount=0;
		int odSum=0, odCount=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evCount++;
				evSum=evSum+arr[i];
			}

			else
			{

				odCount++;
				odSum=odSum+arr[i];
			}
		}


		System.out.println("Even Count: "+evCount);
		System.out.println("Odd Count: "+odCount);



		System.out.println("Even sum: "+evSum);
		System.out.println("Odd Sum:"+odSum);



	}

}
