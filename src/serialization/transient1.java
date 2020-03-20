package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class transient1 {
    public static void main(String[] args) {
        System.out.println("Reading arrays...");

        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {

            Transient t1 = (Transient) os.readObject();
            System.out.println(t1);

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found.");
        } catch (IOException e) {
            System.out.println("File cannot be read.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not inside this application.");
        }
    }
}
