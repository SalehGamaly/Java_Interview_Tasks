package JavaTasks.Week2.Question1;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 35;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println();

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
/*
Numbers -- JavaTasks.Week2.Question1.Swap Numbers
JavaTasks.Week2.Question1.Swap two variable's values without using a third variable
 */