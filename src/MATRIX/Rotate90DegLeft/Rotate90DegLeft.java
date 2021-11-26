package MATRIX.Rotate90DegLeft;

import java.util.Scanner;
/*

 90 Degree Left= Transpose+ Column Reverse
 */
public class Rotate90DegLeft {	

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




	static int[][] isTranspose(int t[][])
	{
		int tr[][]=new int[t[0].length][t.length];
		for(int i=0;i<t.length;i++)
		{
			for(int j=0;j<t[0].length;j++)
			{
				tr[j][i]=t[i][j];
			}
		}

		return tr;
	}


	static int[][] rotateLeft(int colRev[][])
	{
		for(int i=0;i<colRev.length/2;i++)
		{
			for(int j=0;j<colRev[0].length;j++)
			{
				int temp=colRev[i][j];
				colRev[i][j]=colRev[colRev.length-1-i][j];
				colRev[colRev.length-1-i][j]=temp;
			}
		}

		return colRev;
	}

	public static void main(String args[])
	{

		System.out.println("Read  Matrix: ");
		int matrix[][]=readMatrix();

		System.out.println("Display  Matrix: ");
		displayMatrix(matrix);


		System.out.println("Transpose  Matrix: ");
		int transpose[][]=isTranspose(matrix);
		displayMatrix(transpose);



		System.out.println("Rotate 90 deg Left  Matrix: ");
		int rotateArray[][]=rotateLeft(transpose);
		displayMatrix(rotateArray);


	}

}
