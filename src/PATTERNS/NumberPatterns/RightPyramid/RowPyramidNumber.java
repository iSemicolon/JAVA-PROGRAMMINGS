package PATTERNS.NumberPatterns.RightPyramid;

/*
1  
2  2  
3  3  3 

 */

public class RowPyramidNumber {

	public static void main(String[] args) {
		
		for(int row=1;row<=3;row++)
		{ 
			
			for(int col=1;col<=row;col++)
			{  
				
				System.out.print(row+"  ");
			
			}
			
			System.out.println();
		}

	}

}
