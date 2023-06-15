package JavaTasks.week04.Question2;

public class Sandra {

    public static String removeDuplicates(String str){

        String removedDuplicates = "";




        for (int i = 0; i < str.length(); i++) {
            if (!removedDuplicates.contains("" + str.charAt(i))) {
                removedDuplicates += str.charAt(i);
            }
        }
        return removedDuplicates;
    }
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }
}
//String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC