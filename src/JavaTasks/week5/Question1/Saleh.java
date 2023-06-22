package JavaTasks.week5.Question1;

import java.util.HashSet;
import java.util.Set;

public class Saleh {
     /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {

        //System.out.println("uniqueChar1(\"AAABBBCCCDEF\") = " + uniqueChar("AAABBBCCCDEF"));

        System.out.println("uniqueChar2(\"AAABBBCCCDEF\") = " + uniqueChar2("AAABBBCCCDEF"));
    }

    public static String uniqueChar1(String str){

        String uniqueStr = "";

        Set<Character> strSet = new HashSet<>();

        for (char each : str.toCharArray()) {
            strSet.add(each);
        }

        for (Character character : strSet) {
            uniqueStr += character;
        }
        return uniqueStr;
    }

    public static String uniqueChar2(String str){

        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if ( !(uniqueChars.contains(str.charAt(i) + ""))){
                    uniqueChars += str.charAt(i);
                }
            }
        }
        return uniqueChars;
    }



}
