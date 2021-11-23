package ARRAY.ExistingArrayElement;

import java.util.Scanner;

public class ElementPresent {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  array size");


		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter Array Elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Array elements need to check");
		int a=sc.nextInt();


		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println(a+" is present in array");
				return;
			}
		}

		System.out.println(a+" is not present in array");



	}

}
