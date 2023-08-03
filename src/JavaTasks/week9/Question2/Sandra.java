package JavaTasks.week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sandra {

    /*
      ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
    public static void main(String[] args) {

        ArrayList<String> names =  new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sandra", "Ahmed"));
        ArrayList<String> namesNoAhmed = new ArrayList<>();

        for (String each : names) {
            if (!each.equals("Ahmed")){
                namesNoAhmed.add(each);
            }
        }
        System.out.println(namesNoAhmed);

    }


}
