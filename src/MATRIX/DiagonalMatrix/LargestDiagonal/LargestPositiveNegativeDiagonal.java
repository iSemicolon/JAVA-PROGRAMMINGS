package MATRIX.DiagonalMatrix.LargestDiagonal;

import java.util.Scanner;

public class LargestPositiveNegativeDiagonal {


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








	static int positiveBiggest(int matrix[][])
	{
		int biggest=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(i==j)
				{
					if(biggest<matrix[i][j])
					{
						biggest=matrix[i][j];
					}
				}
			}
		}
		return biggest;
	}



	static int neagtiveBiggest(int matrix[][])
	{
		int largest=matrix[0][matrix.length-1];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(i+j==matrix.length-1)
				{
					if(largest<matrix[i][j])
					{
						largest=matrix[i][j];
					}
				}

			}
		}
		return largest;
	}


	public static void main(String args[])
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);



		System.out.println("\nPositive Biggest Diagonal  Matrix: "+positiveBiggest(matrix));


		System.out.println("\nNegative Biggest Diagonal  Matrix: "+ neagtiveBiggest(matrix));


	}

}
