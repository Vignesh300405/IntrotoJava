package Files;

public class typesOfExceptions {
    public static void main(String[] args) {
        //Example of a checked exception, one which has to be handled in the code.
        /*
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

        //Example of a runtime exception, which does not have to handled in code but will throw an error if not handled.
        //This is because it is a child class of the "Exception" class, which does not require to be handled.

        /*
        int value = 7;
        value = value / 0;

         */

        //Example of an nullpointer exception, a string variable needs a string typed in order to work.
        String text = "Hello";
        System.out.println(text.length());

        //Example of an ArrayIndexOutOfBounds exception.
        String[] texts = {"one", "two", "three"};
        //A try-catch could be implemented to identify Runtime Exceptions, but it is better just to fix the actual thing.
        try {
            System.out.println(texts[3]);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
