package JavaTasks.Week1.Question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedWithout {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 1st number:");
        int num1 = input.nextInt();

        System.out.println("Enter your 2nd number");
        int num2 = input.nextInt();

        int divisible = 0;

        if(num2 == 0){
            System.out.println("Invalid number");
        }

        while (num1 >= num2){
            num1 -= num2;
            divisible++;
        }

        System.out.println(num1 + " is the remainder");

        System.out.println(divisible + " is the result");

        input.close();


    }
}
