package JavaTasks.Week3.Question1;

import java.util.Scanner;

public class PrimeNumber {


    static boolean isPrime(int n) {


        if (n <= 1){
            return false;
        }



        for (int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.print("The number is prime: ");
                return false;

            }
        }

        System.out.print("The number is prime: ");
        return true;
    }

    public static void main(String[] args) {


        System.out.println(isPrime(10));


        /*
        if (isPrime(10)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
         */



        // System.out.println("the number is prime? " + isPrime(10));


    }

}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */