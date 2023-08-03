package JavaTasks.week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Armin {

    public static List<String> removeName(List<String> names, String removeName) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : names) { // iterate through each name in the "names" arraylist
            if (!name.equals(removeName)) { // if name is not equal to the name we want to remove
                updatedNames.add(name); // add name to "updatedNames" arraylist
            }
        }
        return updatedNames;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Jane", "Ahmed", "Jack", "Ahmed"));

        List<String> updatedNames = removeName(names, "Ahmed");

        System.out.println(updatedNames);

    }

}
/*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */