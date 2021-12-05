package STRINGS.SpecialCharacterFixed;

/*
 Input: a!!!b,c,d,e,f,ghi
Output: i!!!h,g,f,e,d,cba

 */
public class ReverseStringWithoutAffectSpecialCharacter {

	public static void isReverseString(char str[]) {
		int r=str.length-1;
		int len=0;
		
		while(len<r) {
			if(!Character.isAlphabetic(str [len])) {
				len++;
				
			}
			
			else if(!Character.isAlphabetic(str[r])) {
				r--;
			}
			
			else {
				char temp=str[len];
				str[len]=str[r];
				str[r]=temp;
				len++;
				r--;
			}
		}
	}
	public static void main(String[] args) {
		
		String str="a!!!b,c,d,e,f,ghi";
		
		char[] ch=str.toCharArray();
		System.out.println("Input: "+str);
		
		isReverseString(ch);
		
		String revStr=new String(ch);
		System.out.println("Output: "+revStr);
		
	}

}
