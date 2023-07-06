package JavaTasks.week7.Question3;

import java.util.Arrays;

public class Armin {

    public static int[] sortDescending(int[] array) {

        int temp; // variable used to swap elements

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // check if element i is greater than element j. If true then:

                    temp = array[i]; // temporarily store value of element at index i
                    array[i] = array[j]; // assign element at index i to the element at index j
                    array[j] = temp; // value of element at index j is assigned to variable temp
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10,20,7, 8, 90};

        array = sortDescending(array);

        System.out.println(Arrays.toString(array));


    }

}
/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */