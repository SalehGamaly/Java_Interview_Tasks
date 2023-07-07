package JavaTasks.week7.Question3;

import java.util.Arrays;

public class Sandra {


    public static String ascending (int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int compared = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]){
                    compared = nums[i];
                    nums[i] = nums[j];
                    nums[j] = compared;

                }
            }

        }

        return Arrays.toString(nums);



    }

    public static void main(String[] args) {

        System.out.println(ascending(new int[]{10, 9, 8, 7, -1, 2, 0, 24, 65443}));

    }
}
