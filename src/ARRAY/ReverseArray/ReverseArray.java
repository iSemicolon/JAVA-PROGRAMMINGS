package ARRAY.ReverseArray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		
		System.out.println("Enter all array elements");
		int arr[]=new int[size];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Display Reverse Array ");

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}

	
	}

}
