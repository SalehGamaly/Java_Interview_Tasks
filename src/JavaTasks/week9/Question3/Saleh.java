package JavaTasks.week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Saleh {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(200, 20, 30, 150, 90, 100, 110, 55));
        System.out.println("Solution 1: " + removeIntegerFromList(values));
        System.out.println("Solution 2: " + removeIntegerFromList2(values));
        System.out.println("Solution 3: " + removeIntegerFromList3(values));

    }

    public static List<Integer> removeIntegerFromList(List<Integer> integerList){
        ArrayList<Integer> resultList = new ArrayList<>();

        for (Integer each : integerList) {
            if (each > 100){
                continue;
            }else {
                resultList.add(each);
            }
        }

        return resultList;
    }

    public static List<Integer> removeIntegerFromList2(List<Integer> integerList) {

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()){
            if (iterator.next() > 100){
                iterator.remove();
            }
        }
        return integerList;
    }

    public static List<Integer> removeIntegerFromList3(List<Integer> integerList) {

        integerList.removeIf(p -> p > 100);

        return integerList;
    }

    }
    /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

