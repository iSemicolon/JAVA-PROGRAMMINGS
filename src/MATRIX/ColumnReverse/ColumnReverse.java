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



	static int[][] colWiseReverse(int z[][]) //3*4
	{

		int reverse[][]=new int[z.length][z[0].length];//3*4

		for(int i=0;i<z[0].length;i++)
		{
			for(int j=z.length-1;j>=0;j--)
			{
				reverse[z.length-1-j][i]=z[j][i];
			}
		}

		return reverse;
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
