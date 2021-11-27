package MATRIX.DiagonalMatrix.NegativeDiagonal;

import java.util.Scanner;

public class NegativeDiagonalReadAndDisplay {


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




	static int[] negativeDiagonal(int matrix[][])
	{
		int arr[]=new int[matrix.length];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(i+j==matrix.length-1)
				{
					arr[i]=matrix[i][j];
				}
			}
		}
		return arr;
	}


	public static void main(String args[])
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);



		System.out.println("\nNegative Diagonal  Matrix: ");
		int n1[]=negativeDiagonal(matrix);
		for(int i=0;i<n1.length;i++)
		{
			System.out.println(n1[i]+" ");
		}

		System.out.println("\nNegative Diagonal Reverse Matrix: ");
		for(int i=n1.length-1;i>=0;i--)
		{
			System.out.println(n1[i]+" ");
		}


	}

}
