package PATTERNS.NumberPatterns.LeftPyramid;

public class LeftContiniousPyramidNumber {

	public static void main(String[] args) {
		
		int i=1;
		
		for(int row=1;row<=3;row++)
		{ 
			for(int col=3;col>=row;col--)
			{  
				
				System.out.print(" ");
				
						
			}
			
			for(int col=1;col<=row;col++)
			{  
				
				System.out.print(i);
				i++;
						
			}
			
			System.out.println();
		}

	}

}
