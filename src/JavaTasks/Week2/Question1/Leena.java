package JavaTasks.Week2.Question1;

public class Leena {
      /*
    JavaTasks.Week2.Question1.Swap Numbers

    JavaTasks.Week2.Question1.Swap two variable' values without using a third variable
     */

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Swapped num1 = "+num1);
        System.out.println("Swapped num2 = " + num2);
    }
}
