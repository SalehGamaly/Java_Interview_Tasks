package JavaTasks.week5.Question2;

public class Sandra {
    
    // Write a return method that can reverse  String
    //    Ex: Reverse("ABCD"); ==> DCBA
    
    public static String reversedString(String str){
        
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed + " is a reversed string";
        
    }

    public static void main(String[] args) {
        System.out.println(reversedString("i love my cat"));
    }
}
