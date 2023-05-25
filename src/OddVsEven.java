import java.util.Scanner;

public class OddVsEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner , so the user can enter his/her number

        System.out.println("Enter your number");  // console

        int num = input.nextInt(); // enters -> int num

        if (num %2 == 0){    // remainder
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        input.close(); //closing the scanner

    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */