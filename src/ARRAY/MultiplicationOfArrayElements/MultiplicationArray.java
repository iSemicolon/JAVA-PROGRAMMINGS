package ARRAY.MultiplicationOfArrayElements;

import java.util.Scanner;

public class MultiplicationArray {

	public static void main(String[] args) {

		System.out.println("Enter Array Size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		int sum=1;

		System.out.println("Enter array  elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();

		}

		for(int i=0;i<arr.length;i++)
		{

			sum=sum*arr[i];
		}

		System.out.println("Multiplication of Array Elements:"+sum);
	}


}
