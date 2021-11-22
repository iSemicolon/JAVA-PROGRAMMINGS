package ARRAY.SumOfArrayElements;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		int sum=0;

		System.out.println("Enter array  elements");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();

		}

		for(int i=0;i<arr.length;i++)
		{

		sum=sum+arr[i];
		}

		System.out.println("Sum of Array is:"+sum);
		}
	

}
