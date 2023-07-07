package JavaTasks.week7.Question1;

public class Sandra {

    //  Write a method that can find the maximum number from an int Array


    public static int maxNum(int[]numArray){

        int max = numArray[0];

        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] > max){
                max = numArray[i];
            }


        }

        return max;

    }


    public static void main(String[] args) {
        System.out.println(maxNum(new int[] {10, 122, 34, 245, 245, 233}));
    }

}
