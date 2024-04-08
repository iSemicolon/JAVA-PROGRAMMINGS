package STRINGS.Anagram;

//Two strings are said to be anagram
// if we can form one string by arranging the characters of another string.
// For example, Race and Care. Here, we can form Race by arranging the characters of Care

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramCheck {

   public static void isAnargram(String str1, String str2){


       //converted all are in same word

       char arr1[]=str1.toLowerCase().toCharArray();
       char arr2[]=str2.toLowerCase().toCharArray();

       //sorted cuz all would be in same format
       Arrays.sort(arr1);
       Arrays.sort(arr2);

       if(arr1.length !=arr2.length){
           System.out.println("Not Anargram");
       }
        //important logic
       else if (Arrays.equals(arr1, arr2)){

           System.out.println("Anargram");

       }

       else {
           System.out.println("Not Anargram");
       }

    }

    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Care";

        isAnargram(str1, str2);

    }


}
