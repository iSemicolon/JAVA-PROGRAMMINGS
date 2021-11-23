package ARRAY.DayName;

import java.util.Scanner;

/*
 *I/P- 07/04/1997
 *O/P- MONDAY
 */

public class DayName {


	static String  getDayName(int d,int m,int y)
	{

		int mt[]={ 0,31,28,31,30,31,30,31,31,30,31,30,31};  // we are taking january month as acounting month

		if (y % 400 ==0 || (y%4==0 && y%100 !=0))
		{
			mt[2]=29;
		}

		y=y-1;
		int days= 365*y;

		int lc=y/400 + y/4 -y/100;
		days= days+lc;


		for (int i=1;i<m;i++)
		{
			days=days+mt[i];
		}

		days=days +d;

		String dy[] ={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THRUSDAY","FRIDAY","SATURDAY"};

		return dy[days%7]; 

	}

	public static void main(String args[])
	{

		System.out.println("Enter Date at DD-MM-YYYY FORMAT");
		Scanner sc= new Scanner(System.in);
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		String ds=getDayName(d1,m1,y1);

		System.out.println("Day: "+ds);


	}

}
