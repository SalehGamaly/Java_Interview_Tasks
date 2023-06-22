package JavaTasks.Week3.Question2;

public class ReverseNegative {

    public static long reversedNegative(int num) {

        long reverse = 0;


        while (num < 0) {


                reverse = (reverse * 10) + num % 10;
                num /= 10;
            }

            return reverse;


    }

        public static void main (String[]args){

            System.out.println(reversedNegative(-1230));


        }

}


/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
 */