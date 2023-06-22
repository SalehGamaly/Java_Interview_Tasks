package JavaTasks.week5.Question2;

public class ReverseString {

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() -1 ; i >= 0; i--){// starting last index to index 0
            reverse += (str.charAt(i)); // add each character of the string from last index to index zero
        }

        return reverse;
    }

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println(reverse(str));

    }

}
/*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */