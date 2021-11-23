package ARRAY.LargestAndSmallestElements;

import java.util.Scanner;

public class LargestSmallestArray {

	public static void main(String[] args) {
		System.out.println("Enter  array size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println(" Array Elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int large=arr[0];
		int small=arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
		}


		System.out.println("Large Element: "+large);

		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}

		System.out.println("Small Element: "+small);


	}



}
