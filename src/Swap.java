public class Swap {

    public static void main(String[] args) {

        int x = 15;
        int y = 10;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

    }
}
/*
Numbers -- Swap Numbers
Swap two variable' values without using a third variable
 */