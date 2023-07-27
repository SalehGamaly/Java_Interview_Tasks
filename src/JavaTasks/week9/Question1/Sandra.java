package JavaTasks.week9.Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sandra {

    /*
     Array - Concat two arrays
  Write a return method that can concate two arrays.\

     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoArrays(new String[]{"CatCat, KittenBaby"}, new String[]{"Cat", "Kitten"})));

    }


    public static String[] twoArrays (String[] arr1, String[] arr2){

        List<String> concat = new ArrayList<>();

        Collections.addAll(concat, arr1);
        Collections.addAll(concat, arr2);

        return concat.toArray(new String[0]);



    }


}


