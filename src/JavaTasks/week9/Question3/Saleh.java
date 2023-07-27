package JavaTasks.week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Saleh {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(200, 20, 30, 150, 90, 100, 110, 55));
        System.out.println(removeIntegerFromList(values));

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

}
    /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

