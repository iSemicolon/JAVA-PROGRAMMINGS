package MATRIX.ReadAndDisplay;

import java.util.Scanner;

public class ReadDisplay2dArray {

	static int[][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows and Columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];

		System.out.println("Enter "+(r*c)+" Elements ");

		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
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




	public static void main(String args[])
	{

		System.out.println("Array Reading....");
		int m[][]=readMatrix();

		System.out.println("Array Displaying.....");
		displayMatrix(m);


	}

}
