package JavaTasks.week04.Question1;

import java.util.Arrays;

public class Matt {

    /* ➡️ String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:

    */

    static boolean allCharactersSame(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("allCharactersSame(\"aabbccvee\") = " + allCharactersSame("aabbccvee"));
    }

}
