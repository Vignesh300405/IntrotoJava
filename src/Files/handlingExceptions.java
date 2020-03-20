package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class handlingExceptions {
    public static void main(String[] args) {

        File file = new File("test.txt");
        //There are two main solutions to this problem: adding an exception just throws an exception when the code does not work or to do a try-catch where the caught result is of your choosing.
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            //Try-catch is better when an end-user may see an error, as it gives the individual a better idea of what is wrong.
            System.out.println("We have a problem in Houston with: " + file.getName());
        }
        System.out.println("Completed.");
    }
}
