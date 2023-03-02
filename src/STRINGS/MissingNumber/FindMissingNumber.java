package STRINGS.MissingNumber;


import java.util.Arrays;

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


	public static  int missingNumberFromRepeated(int[] repeatTemp ){

		//sort the array
		Arrays.sort(repeatTemp);

		for (int i=0; i<repeatTemp.length; i++){
			System.out.println("hello: "+repeatTemp[i]);
		}

		//find repeated element testing only optional
		int duplicateNumber=0;

		for (int i=0; i<repeatTemp.length-1; i++){

			if(repeatTemp[i]==repeatTemp[i+1]){
				duplicateNumber=repeatTemp[i];
				System.out.println("Duplicate Number: "+duplicateNumber);
				break;
			}

		}

		int missingNumber=0;
		//starting from array first element
		for (int i =1; i <= repeatTemp.length; i++) {
			if (i != repeatTemp[i - 1]) {
				missingNumber=i;
				break;
			}
		}

		return missingNumber;

	}

	public static void main(String args[])
	{
		System.out.println("Non-Repeated Array Operation");
		int temp[] = {3, 7, 1, 4, 5, 2, 8};

		int number=missingNumberFromNonRepetated(temp);
		System.out.println("Missing Number is  :"+number);

		System.out.println("Repeated Array Operation");
		int repeatTemp[] = { 7, 3, 4, 5, 5, 6, 2 };

		int missingNumber=missingNumberFromRepeated(repeatTemp);
		System.out.println("Missing Numbers is: "+missingNumber);




	}
}
