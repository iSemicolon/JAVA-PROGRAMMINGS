package PATTERNS.NumberPatterns.LeftReversePyramid;
/*

1 1 1 
 2 2 
  3 

 */

public class LeftReverseRowPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=3;row++)
		{ 
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			
			for(int col=3;col>=row;col--)
			{  
				
				System.out.print(row+" ");				
			}
			
			System.out.println();
		}


	}

}
