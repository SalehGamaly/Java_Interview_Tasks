package JavaTasks.week7.Question1;

public class Armin {

    public static int findMinimum(int[] array) {
        int min = array[0]; // initialize 'min' as the first value in the array

        for (int i = 1; i < array.length; i++) { // start from index 1 since index 0 is already assumed as min value
            if (array[i] < min) { // compare each element with the minimum value
                min = array[i]; // if element is smaller than current minimum it is updated
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 12, 9, 65, 23, 19, 2};

        System.out.println(findMinimum(array));
    }

}

/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */