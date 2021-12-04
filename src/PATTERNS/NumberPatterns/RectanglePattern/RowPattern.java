package PATTERNS.NumberPatterns.RectanglePattern;

/*
1 1 1 
2 2 2 
3 3 3 
*/
public class RowPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=3;row++)
		{ 
			
			for(int col=1;col<=3;col++)
			{  
				
				System.out.print(row +" ");
				
			}
			
			System.out.println();
		}

	}

}
