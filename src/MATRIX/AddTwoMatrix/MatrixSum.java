package MATRIX.AddTwoMatrix;

import java.util.Scanner;

public class MatrixSum {


	static int[][] readMatrix()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows and Columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int matrix[][]=new int[r][c];

		System.out.println("Enter "+(r*c)+" Elements ");

		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		return matrix;

	}



	static int[][] addMatrix(int u[][],int v[][])
	{

		if((u.length!=v.length) || (u[0].length !=v[0].length))
		{
			return null;
		}

		int mat[][]=new int[u.length][u[0].length];

		for(int i=0;i<u.length;i++)
		{
			for (int j=0;j<u[i].length;j++)
			{
				mat[i][j]=u[i][j] + v[i][j];
			}
		}

		return mat;
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

	public static void main(String[] args) 
	{

		System.out.println("Read First Matrix: ");
		int matrix1[][]=readMatrix();
		System.out.println("Entred Second Matrix: ");
		int matrix2[][]=readMatrix();


		System.out.println("Display First Matrix: ");
		displayMatrix(matrix1);
		System.out.println("Display Second Matrix: ");
		displayMatrix(matrix2);


		System.out.println("Matrix Addition");
		int a[][]=addMatrix(matrix1, matrix2);
		displayMatrix(a);

	}
}
