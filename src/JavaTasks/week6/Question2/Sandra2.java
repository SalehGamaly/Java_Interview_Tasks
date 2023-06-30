package JavaTasks.week6.Question2;

import java.util.Arrays;

public class Sandra2 {

    public static int maximumNumber(int[] array){

        Arrays.sort(array);

        int maximumNumberResult = array[array.length - 1];

        return maximumNumberResult;


    }

    public static void main(String[] args) {
        System.out.println(maximumNumber(new int[]{12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700}));
    }

}
