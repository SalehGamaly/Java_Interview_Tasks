package JavaTasks.week04.Question1;

import java.util.Arrays;

public class Saleh {
   /* ➡️ String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:

    */

    public static void main(String[] args) {
        System.out.println("sameLetters = " + sameLetters("tea", "eat"));
    }
    public static boolean sameLetters(String str1, String str2) {

        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
}
