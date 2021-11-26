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


		for (int i=0;i<arr.length;i++) //2
		{
			for (int j=0; j<arr[0].length/2;j++)//3
			{
				int temp=arr[i][j];
				arr[i][j]=arr[i][arr[i].length-1-j];
				arr[i][arr[i].length-1-j]=temp; // 00
			}

		}

		return arr;
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
