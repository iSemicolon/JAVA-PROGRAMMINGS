package MATRIX.ColumnSum;

import java.util.Scanner;

public class ColumnSum {

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

	static int[] colWiseSum(int z[][]) //3*4
	{

		int add[]=new int[z[0].length];// 4.
		int k=0;
		for (int i=0;i<z[0].length;i++) //0,1,2,3
		{
			int sum=0; 
			for (int j=0;j<z.length;j++)// 0,1,2,
			{
				sum=sum+z[j][i]; //
			}

			add[k]=sum;//0
			k++;

		}

		return add;
	}




	public static void main(String[] args) 
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);

		System.out.println("ColWise Sum of element ");

		int a[]=colWiseSum(matrix);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("arr["+i+"]="+a[i]);
		}


	}

}
