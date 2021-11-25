package ARRAY.DeleteElement;

import java.util.Scanner;

public class DeleteElement {


	static int[] getArray()
	{
		System.out.println("Enter Array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];


		System.out.println("Enter array Elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}




	static int[] isDelete(int y[], int index)
	{

		if(index<0|| index>y.length)
		{
			System.out.println("Array Index Not In Range");

			return y;
		}

		int ar[]=new int[y.length -1];
		for(int i=0;i<ar.length;i++)
		{

			if(i<index)
			{
				ar[i]=y[i];
			}

			else
			{
				ar[i]=y[i+1];
			}
		}

		return ar;
	}






	static void  display(int x[])
	{

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}

		System.out.println("\n");
	}




	public static void main(String args[])
	{
		System.out.println("Array Reading.....");

		int arr[]=getArray();

		System.out.println("Array Data ");
		display(arr);


		System.out.println("\nEnter delete index ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();


		if(index<arr.length)
		{
			int delArray[]=isDelete(arr,index);
			System.out.println("\nAfter delete element Displaying.....");
			display(delArray);

		}

		else {

			System.out.println("Array Index Not In Range");
		}
	}

}
