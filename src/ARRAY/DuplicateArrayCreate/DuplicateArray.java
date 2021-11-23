package ARRAY.DuplicateArray;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {


		System.out.println("Enter  array size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];

		System.out.println("Enter Array Elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]+" ");
			System.out.println("arr1["+i+"]="+arr1[i]+" ");
		}

}

}
