package JavaTasks;

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
Numbers -- Swap Numbers
Swap two variable's values without using a third variable
 */