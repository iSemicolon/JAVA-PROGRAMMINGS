package MATRIX.RowReverse;

import java.util.Scanner;

public class RowReverse {

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


	static int[][] rowWiseReverse(int arr[][]) //3*4
	{

		int reverse[][]=new int[arr.length][arr[0].length];//3*4

		for (int i=0;i<arr.length;i++) //2
		{
			for (int j=arr[0].length-1;j>=0;j--)//3
			{
				reverse[i][arr[0].length-1-j]=arr[i][j]; // 00
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

		System.out.println("RowWise Reverse ");

		int array[][]=rowWiseReverse(matrix);
		displayMatrix(array); 	

	}

}
