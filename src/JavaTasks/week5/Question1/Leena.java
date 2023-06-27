package JavaTasks.week5.Question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Leena {
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static String Unique(String str) {
        String result ="";
        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        return result;
    }

    public static String uniqueChar(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)) { //  indexOf() returns the index for the first occurrence of the substring. lastIndexOf() returns the index for the last occurrence of the substring.
                //If the first and last occurence index is same, the character will be unique.
                // For example "AAABBBCCCDEF". indexOf and lastIndexOf character 'D' is 9-So , it is unique
                //                             indexOf 'A' 0 and lastIndexOf 'A' is 2, so it is not unique
                unique += each;
            }
        }
        return unique;
    }



}
