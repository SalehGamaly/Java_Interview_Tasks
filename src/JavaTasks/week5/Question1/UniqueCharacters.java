package JavaTasks.week5.Question1;

public class UniqueCharacters {

    public static String findUniqueCharacters(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // a
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) { // check how many times the ch has appeared in str
                if (str.charAt(j) == ch) { // if the ch has appeared in the string
                    frequency++; // increase the frequency by one
                }
            }

            if (frequency == 1) { // if the frequency is one, then it's unique
                unique += ch;
            }

        }

        return unique;
    }

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println(findUniqueCharacters(str));
    }

}
/*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
