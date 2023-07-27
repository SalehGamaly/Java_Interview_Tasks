package JavaTasks.week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Saleh {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Hana", "Ahmed", "Adel", "Ahmed"));
        String remove = "Ahmed";
        System.out.println(removeStringFromList(names, remove));

    }

    public static List<String> removeStringFromList(List<String> stringList, String removeStr){
        ArrayList<String> resultList = new ArrayList<>();

        for (String each : stringList) {
            if (each.equalsIgnoreCase(removeStr)){
                continue;
            }else {
                resultList.add(each);
            }
        }

        return resultList;
    }
}
    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
