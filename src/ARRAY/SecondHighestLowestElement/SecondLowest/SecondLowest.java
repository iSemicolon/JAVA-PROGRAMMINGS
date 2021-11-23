package ARRAY.SecondHighestLowestElement.SecondLowest;

public class SecondLowest {

	public static void main(String[] args) {

		int a[]={-2, 9,-8,3,4,-9,8};

		int f_lowest=a[0];
		int s_lowest=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(f_lowest >a[i])
			{
				s_lowest=f_lowest;
				f_lowest=a[i];
			}

			else if(s_lowest >a[i])
			{
				s_lowest=a[i];
			}

		}
		System.out.println("Second Lowest Number: "+s_lowest);
	}

}
