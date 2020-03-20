package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class transient2 {
    public static void main(String[] args) {
        System.out.println("Writing objects...");


        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {

            Transient t1 = new Transient(1, "Bob");
            Transient.setCount(100);
            os.writeObject(t1);

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found.");
        } catch (IOException e) {
            System.out.println("File cannot be read.");
        }
    }
}
