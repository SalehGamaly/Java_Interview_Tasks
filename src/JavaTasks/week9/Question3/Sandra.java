package JavaTasks.week9.Question3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandra {
    /*
      /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(Arrays.asList(1,3,4,2,3,100,233,133,2222,44));

        List<Integer> newInts = new ArrayList<>();

        for (Integer each : ints) {
            if (each < 100){
                newInts.add(each);
            }
        }

        System.out.println(newInts);



    }


}
