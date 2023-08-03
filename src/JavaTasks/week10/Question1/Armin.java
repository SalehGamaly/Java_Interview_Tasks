package JavaTasks.week10.Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Armin {

    public static void sortAscending(ArrayList<Integer> list){

        int n = list.size();

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j) > list.get(j + 1)){// if element at j is greater than next element, they need to be swapped
                    int temp = list.get(j); // temporarily store j into temp
                    list.set(j, list.get(j + 1)); // move value of next element into current j's position
                    list.set(j + 1, temp); // value of current j stored in temp moved to next position
                }

            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2 , 7, 3 , 4, 1));

        sortAscending(list);

        System.out.println(list);

    }

}
/*
ArrayList - sorting in ascending
  Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */