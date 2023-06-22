package JavaTasks.week5.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Saleh {

    /*
        Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        //System.out.println("reverseString(\"ABCDE\") = " + reverseString1("ABCDE"));
        System.out.println("reverseString2(\"FGHIJKL\") = " + reverseString2("FGHIJKL"));
        System.out.println("reverseString3(\"nopqr\") = " + reverseString3("nopqr"));
    }

    public static String reverseString1(String str){

        String reversedStr = "";

        for (int i = str.length()-1; i >0 ; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static String reverseString2(String str){

        String reversedStr2 = "";

        Stack<Character> stringStack = new Stack<>();

        for (char each : str.toCharArray()) {
            stringStack.push(each);
        }

        while ( !stringStack.isEmpty() ){
            reversedStr2 += stringStack.pop();
        }
        return reversedStr2;
    }

    public static String reverseString3(String str){

        String reversedStr3 = "";

        ArrayList<Character> arrayList = new ArrayList<>();

        for (char each : str.toCharArray()) {
            arrayList.add(each);
        }

        Collections.reverse(arrayList);
        for (Character eachChar : arrayList) {
        }
        reversedStr3 += arrayList;

        return reversedStr3;
    }

}
