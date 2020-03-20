package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class serializeArrays2 {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        serializeArrays[] sa1 = {new serializeArrays(1, "Bob"), new serializeArrays(2, "Joe")};

        ArrayList<serializeArrays> al1 = new ArrayList<>(Arrays.asList(sa1));


        //This sends data sequentially to a file.
        try(FileOutputStream fs = new FileOutputStream("test.ser")) {
            //Allows to write the objects to a file.
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            oos.writeObject(sa1);

            oos.writeObject(al1);

            oos.writeInt(al1.size());

            for(serializeArrays sl1: al1) {
                oos.writeObject(sl1);
            }


            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be created.");
        } catch (IOException e) {
            System.out.println("File cannot be written to.");
        }

    }
}
