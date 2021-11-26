package MATRIX.RowSum;

import java.util.Scanner;

public class RowSum {


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


	static int[] rowWiseSum(int z[][])
	{

		int add[]=new int[z.length];

		for (int i=0;i<z.length;i++)
		{
			int sum=0;
			for (int j=0;j<z[i].length;j++)
			{
				sum=sum+z[i][j];
			}
			add[i]=sum;
		}

		return add;
	}




	public static void main(String[] args) 
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);

		System.out.println("RowWise Sum ");

		int arrSum[]=rowWiseSum(matrix);
		for(int i=0;i<arrSum.length;i++)
		{
			System.out.println("arrSum["+i+"]="+arrSum[i]);
		}


	}


}
