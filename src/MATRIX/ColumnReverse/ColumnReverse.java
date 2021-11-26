package MATRIX.ColumnReverse;

import java.util.Scanner;

public class ColumnReverse {


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



	static int[][] colWiseReverse(int matrix[][]) //3*4
	{


		for(int i=0;i<matrix.length/2;i++)
		{
			for(int j=0; j<matrix[0].length;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[matrix.length-1-i][j];
				matrix[matrix.length-1-i][j]=temp;
			}
		}

		return matrix;
	}




	public static void main(String[] args) 
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);

		System.out.println("ColWise Reverse element ");

		int arr[][]=colWiseReverse(matrix);
		displayMatrix(arr); 



	}

}
