package PATTERNS.NumberPatterns.LeftPyramid;

/*
1 
2 2 
3 3 3  
 */

public class LeftRowPyramid {


	public static void main(String[] args) {

		for(int row=1;row<=3;row++)
		{ 
			for(int col=3;col>=row;col--)
			{  

				System.out.print(" ");

			}

			for(int col=1;col<=row;col++)
			{  

				System.out.print(row+" ");

			}

			System.out.println();
		}


	}

}
