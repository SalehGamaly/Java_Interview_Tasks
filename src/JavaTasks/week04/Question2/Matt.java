package JavaTasks.week04.Question2;

public class Matt {

    /*
     String -- Remove Duplicates
     Write a return method that can remove the duplicated values from String
     Ex: removeDup("AAABBBCCC") ==> ABC
     */


    public static String removeDups(String str) {


        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: represents index numbers of str


            char each = str.charAt(i);  // each character of the string str

            if (!result.contains("" + each)){ // if the string result doesn't contain the character of string str yet
                result += each;  // then we will add the character to string result

            }
            // if the character is not contained yet in the new string, then we will add it to the string
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("removeDups(\"xxxxxvvvvvttttmmmmwwwwq\") = " + removeDups("xxxxxvvvvvttttmmmmwwwwq"));
    }
}
