package JavaTasks.week9.Question1;

import java.util.Arrays;

public class Armin {

    public static int[] concatArrays(int[] array1, int[]array2){

        //getting lengths of array1 and array2 and storing them in variables length1 and length2
        int length1 = array1.length;
        int length2 = array2.length;

        int[] result = new int[length1 + length2]; // result array (has sum of the lengths of two arrays), will be used to store concatenated elements


        for (int i = 0; i < length1; i++) { // copy elements from the first array to the result array
            result[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) { // copy elements from second array to the result array
            result[length1 + i] = array2[i]; // copies each element from "array2" to the positions in the "result" array that come after the elements are copied from "array1"
        }

        return result;

    }

    public static void main(String[] args) {
        int[] array1 = {4, 5, 6};
        int[] array2 = {7, 8, 9};

        int[] result = concatArrays(array1, array2);
        System.out.println(Arrays.toString(result));

    }


}
 /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */