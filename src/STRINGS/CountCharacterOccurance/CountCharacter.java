package STRINGS.CountCharacterOccurance;

/*
input: "JAVA IS POPULAR"
output:
J Occurs 1  Times
A Occurs 3  Times
V Occurs 1  Times
I Occurs 1  Times
S Occurs 1  Times
P Occurs 2  Times
O Occurs 1  Times
U Occurs 1  Times
L Occurs 1  Times
R Occurs 1  Times

 */

public class CountCharacter {

	public static void main(String[] args) {
		

			String str= "JAVA IS POPULAR"; //ACBA
			//Creating empty Array of size 256. all the location have value zero

			int count[]=new int[256];
			//[0|0|0|0|0|0|0|0|0|0|0|0|0]  size 0---256



			//Update number of elements occur taking individual element


			for(int i=0;i<str.length();i++)
			{

			count[str.charAt(i)]++;  
			}

			/* count[65]=1
			   count[67]= 1                
			    count[65]= 2
			    count[66]=1


			 This array holds the occurrence of each char, For example
				 ASCII value of A is 65 so if A is found twice then 
				  counter[65] would have the value 2, here 65 is the ASCII value
				  of A
				 
			*/





			char ch1[]=str.toCharArray();
			for(int i=0;i<str.length();i++)
			{

			int find=0;

			for(int j=0;j<=i;j++)
			{

			if(ch1[i]!= ' ' && ch1[i]==ch1[j]) //not to print blank space
			{

			find++;
			}

			//We dont need duplicate thing print twise, to find duplicate time we need find==1
			}

			if(find==1)
			{

			System.out.println(ch1[i]+" Occurs "+count[ch1[i]]+"  Times");

			}
			}

			}
	}
