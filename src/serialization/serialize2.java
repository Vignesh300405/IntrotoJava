package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class serialize2 {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        serialize s1 = new serialize(1, "Bob");
        serialize s2 = new serialize(2, "Dan");

        System.out.println(s1);
        System.out.println(s2);

        //This sends data sequentially to a file.
        try(FileOutputStream fs = new FileOutputStream("people.bin")) {
            //Allows to write the objects to a file.
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            oos.writeObject(s1);
            oos.writeObject(s2);

            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be created.");
        } catch (IOException e) {
            System.out.println("File cannot be written to.");
        }

    }
}
