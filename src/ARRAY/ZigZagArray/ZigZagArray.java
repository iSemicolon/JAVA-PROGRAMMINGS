package ARRAY.ZigZagArray;

import java.util.Scanner;

public class ZigZagArray {

	static int[] getArray()
	{

		System.out.println("Enter array size");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array element");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		return arr;
	}


	static int[] getZigZag(int x[], int y[])
	{
		int ar[]=new int[x.length + y.length];

		int j=0;
		int k;

		for(  k=0;k<ar.length;)
		{

			if(j<x.length)
			{
				ar[k]=x[j];
				k++;
			}

			if(j<y.length)
			{
				ar[k]=y[j];
				k++;
			}

			j++;
		}

		return ar;
	}


	static void display(int h[])
	{
		for (int i=0;i<h.length;i++)
		{
			System.out.print(h[i]+" ");
		}

	}

	public static void main(String[] args) {


		System.out.println("Read First Element");
		int d[]=getArray();


		System.out.println("Read Second Element");
		int e[]=getArray();

		int f[]=getZigZag(d,e);
		System.out.println("Display Zigxag Array");

		display(f);

	}

}
