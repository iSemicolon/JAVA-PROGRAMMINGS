package STRINGS.Demo;

public class StringDemo {

	public static void main(String[] args) {
		String str="HI JAVA";

		System.out.println("String Length:"+str.length());

		System.out.print("String Print:");
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}

		System.out.println("\nIndex Find...");
		System.out.println("V's Index Value: "+str.indexOf("V"));

		System.out.println("4th Index Value: "+str.charAt(4));

		char arr[]=str.toCharArray();
		
		System.out.println("Character String Print...");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");

		}
	}

}
