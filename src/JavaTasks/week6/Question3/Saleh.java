package JavaTasks.week6.Question3;

public class Saleh {
    public static void main(String[] args) {
        //System.out.println("sum(\"Ab2jhg3nnbh4bhk5\") = " + sum("A4B8C6D2"));
    }

public static int sum(String str){
    String container = "";
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))){
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += n;
        }
    }

    return sum;
}

}
/*
3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
 */