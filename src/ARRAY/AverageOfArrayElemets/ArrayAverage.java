package ARRAY.AverageOfArrayElemets;

import java.util.Scanner;

public class ArrayAverage {

	
	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		double arr[]=new double[n];

		double sum=0;

		System.out.println("Enter array  elements");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();

		}

		for(int i=0;i<arr.length;i++)
		{

		sum=sum+arr[i];
		}
		
		double avg=sum/arr.length;

		System.out.println("Average of Array Elements:"+avg);
		}
	

}
