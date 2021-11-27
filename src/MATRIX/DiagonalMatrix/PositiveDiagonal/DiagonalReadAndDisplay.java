package MATRIX.DiagonalMatrix.PositiveDiagonal;

import java.util.Scanner;

public class DiagonalReadAndDisplay {


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






	static int[] positiveDiagonal(int matrix[][])
	{
		int arr[]=new int[matrix.length];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(i==j)
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

		System.out.println("Positive Diagonal  Matrix: ");
		int p1[]=positiveDiagonal(matrix);
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i]+" ");
		}


		System.out.println("Positive Diagonal Reverse Matrix: ");
		for(int i=p1.length-1;i>=0;i--)
		{
			System.out.println(p1[i]+" ");
		}  


	}
}