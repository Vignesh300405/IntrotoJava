package recursionClasses;

public class recursion {
    public static void main(String[] args) {
        System.out.println(hello(5));
    }

    private static int hello(int value) {
        //Does not work because it calls itself continuously, an infinite loop.
        //System.out.println(value);

        //This allows for a recursive loop method to stop at a certain value.

        if(value == 1) {
            return 1;
        }

        return hello(value - 1) * value;


    }
}
