package BASICS.FibonacciSeries;

import java.util.Scanner;

/*
*
* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

Fn = Fn-1 + Fn-2
Input  : n = 2
Output : 1

Input  : n = 9
Output : 34
*/
public class FibonacciSeries {

	static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
 
    public static void main (String args[])
    {
    	System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    System.out.println(n+" th Value of Fibonacci Series: "+fib(n));
    }

}
