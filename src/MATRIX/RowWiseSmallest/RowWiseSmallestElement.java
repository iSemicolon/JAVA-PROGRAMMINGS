package MATRIX.RowWiseSmallest;

import java.util.Scanner;

public class RowWiseSmallestElement {


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


			static int[] rowWiseSmlEle(int arr[][])
			{

				int sml[]=new int[arr.length];
				for (int i=0;i<arr.length;i++)
				{
					int small=arr[i][0];
					for (int j=1;j<arr[i].length;j++)
					{
						if (small>arr[i][j])
						{
							small=arr[i][j];
						}
						sml[i]=small;
					}
				}

				return sml;
			}




			public static void main(String[] args) 
			{

				System.out.println("Read  Matrix: ");
				int matrix[][]=readMatrix();

				System.out.println("Display  Matrix: ");
				displayMatrix(matrix);

				System.out.println("RowWise Biggest element ");

				int array[]=rowWiseSmlEle(matrix);
				for(int i=0;i<array.length;i++)
				{
					System.out.println("matrix["+i+"]="+array[i]);
				}

			}	

}
