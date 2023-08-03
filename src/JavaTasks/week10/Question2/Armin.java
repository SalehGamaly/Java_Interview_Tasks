package JavaTasks.week10.Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Armin {

    public static void sortDescending(ArrayList<Integer> list){
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j) < list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2 , 7, 3 , 4, 1));

        sortDescending(list);

        System.out.println(list);

    }




}
/*
ArrayList - sorting in descending order
  Write a method that can sort the ArrayList in descending order without
using the sort method
 */