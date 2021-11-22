package ARRAY.InputAndDisplay;

import java.util.Scanner;

public class ArrayInputAndDisplay {



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		
		System.out.println("Enter all array elements");
		int arr[]=new int[size];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Array elements are");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}

	}


}
