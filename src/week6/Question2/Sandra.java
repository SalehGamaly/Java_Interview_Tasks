package week6.Question2;

import java.lang.reflect.Array;

public class Sandra {

    //  Find Maximum:
    //  Write a method that can find the maximum number from an int Array.

    public static int maximumNumber(int[] array){

        int max = array[0];


        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];

            }
        }
            return max;


    }

    public static void main(String[] args) {
        System.out.println(maximumNumber(new int[]{10, 233, 22, 33, -12,10002}));
    }



}
