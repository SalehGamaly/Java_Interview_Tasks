package JavaTasks.week9.Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Saleh {

    public static void main(String[] args) {

        String[] arr1 = {"Hi", "Hola"};
        String[] arr2 = {"Hiii", "Holaaa"};
        System.out.println(concat2StringArrays(arr1, arr2));


        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {5, 6, 7, 8};

        System.out.println(concat2intArrays(arr3, arr4));
    }

    public static List<String> concat2StringArrays(String[] arr1, String[] arr2){

        List<String> resultList = new ArrayList<>(arr1.length + arr2.length);
        Collections.addAll(resultList, arr1);
        Collections.addAll(resultList, arr2);

        return resultList;
    }

    public static List<Integer> concat2intArrays(int[] arr1, int[] arr2){

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            resultList.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            resultList.add(arr2[j]);
        }
        return resultList;
    }


}
    /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */

