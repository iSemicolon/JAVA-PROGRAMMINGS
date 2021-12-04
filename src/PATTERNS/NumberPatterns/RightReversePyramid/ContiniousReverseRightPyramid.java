package PATTERNS.NumberPatterns.RightReversePyramid;

/*
1 2 3 
4 5 
6
 */

public class ContiniousReverseRightPyramid {

	public static void main(String[] args) {
		
		int n=1;
		for(int row=1;row<=3;row++)
		{ 
			
			for(int col=3;col>=row;col--)
			{  
				
				System.out.print(n+" ");
				n++;		
			}
			
			System.out.println();
		}

	}

}
