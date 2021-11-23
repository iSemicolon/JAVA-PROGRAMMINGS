package ARRAY.SecondHighestLowestElement;

public class SecondHighest {

	public static void main(String[] args) {

		int a[]={-2, 9,-8,3,4,-9,8};

		int f_highest=a[0];
		int s_highest=a[0];
		for(int i=1;i<a.length; i++)
		{


			if(a[i]>f_highest)
			{
				s_highest=f_highest;
				f_highest=a[i];
			}

			else if(a[i]>s_highest)
			{
				s_highest=a[i];
			}

		}
		System.out.println("Second Highest Number is: "+s_highest);
	}


}
