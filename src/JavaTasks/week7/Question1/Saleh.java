package JavaTasks.week7.Question1;

public class Saleh {
        /*
    Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

        //System.out.println("maximumNumber({10 = " + maximumNumber(new int[]{10, 15, 20, 5}));
    }
    public static int maximumNumber(int[] numbers) {

        int maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }
             }
        return maxNum;
    }

}
