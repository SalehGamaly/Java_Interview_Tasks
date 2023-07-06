package JavaTasks.week7.Question2;

import java.util.Arrays;

public class Armin {

    public static int[] sortAscending(int[] array) {

        int temp; // variable used to swap elements

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) { // check if element j is greater than element i. If true then:

                    temp = array[i]; // temporarily store value of element at index i
                    array[i] = array[j]; // assign element at index i to the element at index j
                    array[j] = temp; // value of element at index j is assigned to variable temp
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7};

        array = sortAscending(array);

        System.out.println(Arrays.toString(array));

    }

}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */