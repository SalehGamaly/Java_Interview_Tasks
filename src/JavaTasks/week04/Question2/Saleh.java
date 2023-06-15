package JavaTasks.week04.Question2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Saleh {
    /*
     String -- Remove Duplicates
     Write a return method that can remove the duplicated values from String
     Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDub(String str){
        Set<Character> set = new HashSet<>();

        for (char eachChar : str.toCharArray()) {
            set.add(eachChar);
        }

        String newStr = "";
        for (Character each : set) {
            newStr += each;
        }
        return newStr;
    }

    public static void main(String[] args) {


        System.out.println("removeDub(\"AAABBBCCC\") = " + removeDub("AAABBBCCC"));
    }
}
