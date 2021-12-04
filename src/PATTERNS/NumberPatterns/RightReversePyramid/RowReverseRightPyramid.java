package PATTERNS.NumberPatterns.RightReversePyramid;

/*
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5

 */

public class RowReverseRightPyramid {

	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++)
		{ 
			
			for(int col=5;col>=row;col--)
			{  
				
				System.out.print(row+" ");		
			}
			
			System.out.println();
		}

	}

}
