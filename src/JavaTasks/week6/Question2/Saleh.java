package JavaTasks.week6.Question2;

public class Saleh {
    public static void main(String[] args) {

        System.out.println("maxNumber = " + maxNumber(new int[]{5, 10, 13, 7, 20, 9}));
    }
    public static int maxNumber(int[] numArr){

        int max = numArr[0];
        for (int eachNum : numArr) {
            if (eachNum > max){
                max = eachNum;
            }
        }

        return max;
    }
}
/*
2. Find Maximum:
  Write a method that can find the maximum number from an int Array.
 */