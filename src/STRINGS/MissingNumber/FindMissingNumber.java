package STRINGS.MissingNumber;



public class FindMissingNumber {
	
	public static int missingNumberFromNonRepetated(int arr[])
	{
		
		int size=arr.length;
		
		int expectedSum= (size+1) * (size+2)/2;
		
		int sum=0;
		for (int i=0; i<size; i++) {
			
			sum=sum+arr[i];
			
		}

		
		return expectedSum-sum;
	}

	public static void main(String args[])
	{
		System.out.println("Non-Repeated Array Operation");
		int temp[] = {3, 7, 1, 4, 5, 2, 8};

		int number=missingNumberFromNonRepetated(temp);
		System.out.println("Missing Number is  :"+number);


	}
}
