package MATRIX.ColumnWiseLargest;

import java.util.Scanner;

public class columnWiseLargestElement {



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

	static int[] colWiseBigEle(int z[][])//3*4
	{

		int big[]=new int[z[0].length];// 4
		for (int i=0;i<z[0].length;i++) //0,1
		{
			int large=z[0][i]; //00 01
			for (int j=0;j<z.length;j++)// 1,2
			{
				if (large<z[j][i])// 10 20 
				{
					large=z[j][i];
				}
			}
			big[i]=large;//0
		}

		return big;
		
		
	}




	public static void main(String[] args) 
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);
		;

		System.out.println("Column Wise Biggest element ");

		int arr[]=colWiseBigEle(matrix);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}


	}

}
