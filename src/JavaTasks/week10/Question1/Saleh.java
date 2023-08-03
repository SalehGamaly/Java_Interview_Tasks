package JavaTasks.week10.Question1;

import java.util.ArrayList;

public class Saleh {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(6);

        System.out.println(sortedArrList(arrayList));
    }

public static ArrayList<Integer> sortedArrList(ArrayList<Integer> arrayList){

        for (int i = 0; i < arrayList.size() - 1; i++) {

            for (int j = i + 1; j < arrayList.size(); j++) {

                int arrListi = arrayList.get(i);
                int arrListj = arrayList.get(j);
                int temporary = arrayList.get(i);

                if (arrListi > arrListj) {
                    arrayList.set(i, arrListj);
                    arrayList.set(j, temporary);
                }

            }
        }
        return arrayList;
        }
}
/*
1. ArrayList - sorting in ascending
  Write a method that can sort the ArrayList in Ascending order without using
the sort method.

 */