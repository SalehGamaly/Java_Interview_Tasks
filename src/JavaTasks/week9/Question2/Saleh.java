package JavaTasks.week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Saleh {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Hana", "Ahmed", "Adel", "Ahmed"));
        String remove = "Ahmed";
        System.out.println("Solution 1: " +removeStringFromList(names, remove));
        System.out.println("Solution 2: " +removeStringFromList2(names, remove));
        System.out.println("Solution 3: " +removeStringFromList3(names, remove));

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

    public static List<String> removeStringFromList2(List<String> stringList, String removeStr){

        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase(removeStr)){
                iterator.remove();
            }
        }

        return stringList;
    }

    public static List<String> removeStringFromList3(List<String> stringList, String removeStr){

        stringList.removeIf(p -> p.equalsIgnoreCase(removeStr));

        return stringList;
    }


}
    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
