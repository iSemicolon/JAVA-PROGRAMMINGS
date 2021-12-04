package PATTERNS.NumberPatterns.LeftReversePyramid;
/*

654
 32
  1

 */

public class LeftReverseContiniousNumber {

	public static void main(String[] args) {
		
		int n=6;

		for(int row=1;row<=3;row++)
		{ 
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			
			for(int col=3;col>=row;col--)
			{  
				
				System.out.print(n);
				n--;				
			}
			
			System.out.println();
		}

		
	}

}
