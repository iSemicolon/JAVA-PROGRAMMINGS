package STRINGS.CountWord;

public class WordCount {

	public static void main( String args[])

	{

		String str=" I AM PALASH SAMANTA ";

		char ch[]=str.toCharArray();

		int count =0;

		for(int i=0; i<ch.length;i++)
		{

			if((i==0 && ch[i]!=' ') ||  (ch[i]!=' ' && ch[i-1]==' '))

			{
				count ++;
			}
		}

		System.out.println("Number of Word: "+count);
	}


}


