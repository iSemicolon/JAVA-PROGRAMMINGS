package MATRIX.SmallestAndLargest;

import java.util.Scanner;

public class SmallestLargest {

	static int[][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows and Columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];

		System.out.println("Enter "+(r*c)+" Elements ");

		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}



	static void displayMatrix(int mt[][])
	{
		for(int i=0;i<mt.length;i++)
		{
			for(int j=0;j<mt[i].length;j++)
			{
				System.out.print(mt[i][j]+" ");
			}
			System.out.println("");
		}
	}

	static int[] getBiggestSmallest(int arr[][])
	{

		int large=arr[0][0];
		int small=arr[0][0];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(large<arr[i][j])
				{
					large=arr[i][j];
				}

				if(small>arr[i][j])
				{
					small=arr[i][j];
				}
			}
		}

		int array[]={large,small};

		return array;
	}

	public static void main(String args[])
	{



		System.out.println("Array Reading....");
		int matrix[][]=readMatrix();


		System.out.println("Finding Biggest & largest......");
		int bigSmall[]=getBiggestSmallest(matrix);
		System.out.println("Biggest Element:"+bigSmall[0]);
		System.out.println("Smallest Element:"+bigSmall[1]);

	}
}
