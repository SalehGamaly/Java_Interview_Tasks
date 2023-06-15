package JavaTasks.week04.Question1;

import java.util.Arrays;
import java.util.SortedMap;

public class Alina {

     /* ➡️ String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:

    */

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "abc"));



        }

        public static boolean sameLetters(String str1, String str2){
        if(str1==""){
            return str2=="";
        }else if(str2==""){
            return false;

        }

        char[] left =str1.toCharArray();
        char[] right =str2.toCharArray();
            Arrays.sort(left);
            Arrays.sort(right);

            return Arrays.equals(left, right);


    }
}
