package JavaTasks.week5.Question1;

import java.util.HashSet;
import java.util.Set;

public class Sandra {

    //  Write a return  method that can find the unique characters from the String
    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static String uniqueCharacters(String notUnique) {

        String unique = "";

        for (int i = 0; i < notUnique.length(); i++) {
            char eachLetter = notUnique.charAt(i);

            if (notUnique.indexOf(eachLetter) == notUnique.lastIndexOf(eachLetter)) {

                unique += eachLetter;
            }
        }

        return "Unique characters are: " + unique;

    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("AAABBBCCCDEEF"));

    }
    }