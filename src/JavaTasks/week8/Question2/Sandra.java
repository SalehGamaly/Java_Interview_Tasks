package JavaTasks.week8.Question2;

import java.util.Arrays;

public class Sandra {

    public static String zerosToEnd(int[] nums){

        int zerosCount = 0;
        int[] newnums = new int[nums.length];


        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                newnums[j++] = nums[i];
            }
        }


        return Arrays.toString(newnums);
    }

    public static void main(String[] args) {
        System.out.println(zerosToEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0}));
    }
}
