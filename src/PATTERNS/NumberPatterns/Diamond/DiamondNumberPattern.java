package PATTERNS.NumberPatterns.Diamond;

/*
 
  1
 212
32123
 212
  1
 
 */

public class DiamondNumberPattern {


	public static void display(int n)
	{
		// sp stands for space
		// st stands for number
		int sp = n / 2, st = 1;

		// Outer for loop for number of lines
		for (int i = 1; i <= n; i++) {

			// Inner for loop for printing space
			for (int j = 1; j <= sp; j++)
				System.out.print(" ");

			// Inner for loop for printing number
			int count = st / 2 + 1;
			for (int k = 1; k <= st; k++) {
				System.out.print(count);
				if (k <= st / 2)
					count--;
				else
					count++;
			}

			// To goto next line
			System.out.println();
			if (i <= n / 2) {

				// sp decreased by 1
				// st increased by 2
				sp = sp - 1;
				st = st + 2;
			}

			else {

				sp = sp + 1;
				st = st - 2;
			}
		}
	}


	public static void main(String[] args)
	{

		display(5);
	}


}
