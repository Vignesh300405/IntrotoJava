package Files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class multipleExceptions {
    public static void main(String[] args) {
        multipleExceptions2 me = new multipleExceptions2();

        //A method where each error can have its own certain error message.
        /*
        try {
            me.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse file.");
        }
        */

        //This involves deploying the same error regardless of what error is called up.
        /*
        try {
            me.run();
        } catch (IOException | ParseException e) {
            System.out.println("Couldn't do anything.");
        }
        */

        //This does the same thing as above, but changes the error type to "Exception" which is the parent class for all errors, so any type of error can be caught in that way.
        try {
            me.run();
        } catch (Exception e) {
            System.out.println("Couldn't do anything.");
        }


        //In this situation, the child class of IOException (FileNotFoundException) is run before IOException in order to make sure that specifically the child error is found first.
        /*
        try {
            me.input();
        }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }catch (IOException e) {
            System.out.println("Couldn't do anything.");
        }

         */
    }
}
