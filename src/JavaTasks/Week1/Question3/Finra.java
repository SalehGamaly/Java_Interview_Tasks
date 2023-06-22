package JavaTasks.Week1.Question3;

public class Finra {

    public static void main(String[] args) {

        String result = "";

        for (int num = 1; num <= 30 ; num++) {

            if (num % 3 == 0 && num % 5 != 0){
                result = "FIN";
            }else if (num % 5 == 0 && num % 3 != 0){
                result = "RA";
            }else if (num % 3 == 0 && num % 5 == 0){
                result = "FINRA";
            } else {
                result = num + " ";
            }

            System.out.println(result + " " );
        }

    }
}
/*
Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
- for numbers which are multiple of 3 print "FIN" instead of the number,
- for numbers which are multiple of 5, print "RA" instead of the number,
- and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */