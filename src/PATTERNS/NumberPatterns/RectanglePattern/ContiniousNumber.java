package PATTERNS.NumberPatterns.RectanglePattern;

/*
1  2  3  
4  5  6  
7  8  9  
 */

public class ContiniousNumber {

	public static void main(String[] args) {
		
		int n=1;
		for(int row=1;row<=3;row++)
		{ 
			
			for(int col=1;col<=3;col++)
			{  
				
				System.out.print(n+"  ");
				n++;
				
			
			}
			
			System.out.println();
		}

	}

}
