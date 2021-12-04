package PATTERNS.NumberPatterns.RightPyramid;

/*
1  
2  3  
4  5  6
 */
public class ContiniousRightPyramid {

	public static void main(String[] args) {
		int n=1;
		
		for(int row=1;row<=3;row++)
		{ 
			
			for(int col=1;col<=row;col++)
			{  
				
				System.out.print(n+"  ");
				n++;
			
			}
			
			System.out.println();
		}

	}

}
