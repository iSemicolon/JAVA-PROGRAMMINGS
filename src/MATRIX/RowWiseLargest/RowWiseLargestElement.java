package MATRIX.RowWiseLargest;

import java.util.Scanner;

public class RowWiseLargestElement {

	static int[][] readMatrix()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows and Columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int matrix[][]=new int[row][col];

		System.out.println("Enter "+(row*col)+" Elements ");

		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		return matrix;

	}


	static void displayMatrix(int matrix[][])
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}


	static int[] rowWiseBigEle(int arr[][])
	{

		int big[]=new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			int large=arr[i][0];
			for (int j=1;j<arr[i].length;j++)
			{
				if (large<arr[i][j])
				{
					large=arr[i][j];
				}
				big[i]=large;
			}
		}

		return big;
	}




	public static void main(String[] args) 
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);

		System.out.println("RowWise Biggest element ");

		int array[]=rowWiseBigEle(matrix);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("matrix["+i+"]="+array[i]);
		}

	}	

}
