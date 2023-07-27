package JavaTasks.week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;

public class Armin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 100, 101, 200, 300, 500));

        int i = 0; // initialize i

        while (i < list.size()){
            if(list.get(i) > 100){ // check if element at current "i" is greater than 100
                list.remove(i); // if it is greater than 100, remove it from the list
            }else{
                i++; // if not greater than 100 move on to the next index
            }
        }

        for (int j = 0; j < list.size(); j++) { // iterate through remaining elements
            System.out.println(list.get(j));
        }


    }

}
  /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */