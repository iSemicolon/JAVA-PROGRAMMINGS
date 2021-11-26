package MATRIX.MatrixMultiplication;

import java.util.Scanner;

public class MatrixMultiplication {
		
			
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




		 
		 
static int[][] mulMatrix(int matrix1[][],int matrix2[][])
{

	int mulMat[][]=new int[matrix1.length][matrix2[0].length];
		
		   
	 	 if(matrix1[0].length==matrix2.length)
		 {
		  for(int i=0;i<matrix1.length;i++)
		  {
		  	for(int j=0;j<matrix2[0].length;j++)
		  	{
		  		int sum =0;
		  		for(int k=0;k<matrix2.length;k++)
		  		{
		  			sum=sum+(matrix1[i][k] * matrix2[k][j]);
				}
		  		mulMat[i][j]=sum;
			  }
			  
		  }
		 }
	 	 
	 	 else {
	 		System.out.println("Matrix1 row's Size Should be Match With Matrix2 column's size");
	 	 }
		  
	 	 
	 	 return mulMat;
	 }



public static void main(String args[])
{

	System.out.println("Read First Matrix: ");
	int matrix1[][]=readMatrix();
	System.out.println("Entred Second Matrix: ");
	int matrix2[][]=readMatrix();


	System.out.println("Display First Matrix: ");
	displayMatrix(matrix1);
	System.out.println("Display Second Matrix: ");
	displayMatrix(matrix2);
	
	
	System.out.println("Matrix Multiplication");
	int a[][]=mulMatrix(matrix1, matrix2);
	displayMatrix(a);


}

}
