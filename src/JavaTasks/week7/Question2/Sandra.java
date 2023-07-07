package JavaTasks.week7.Question2;

import java.util.Arrays;

public class Sandra {


      /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static String ascending (int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int compared = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] > nums[i]){
                    compared = nums[i];
                    nums[i] = nums[j];
                    nums[j] = compared;
                }
            }

        }

        return Arrays.toString(nums);



    }

    public static void main(String[] args) {

        System.out.println(ascending(new int[]{10, 9, 8, 7,-1,2,0,24,65443}));


    }

}
