package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class serializeArrays1 {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fis = new FileInputStream("test.ser")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            serializeArrays[] sa1 = (serializeArrays[]) ois.readObject();
            @SuppressWarnings("unchecked")
            ArrayList<serializeArrays> sa2 = (ArrayList<serializeArrays>) ois.readObject();

            for(serializeArrays sa: sa1) {
                System.out.println(sa);
            }

            for(serializeArrays sa: sa2) {
                System.out.println(sa);
            }

            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found.");
        } catch (IOException e) {
            System.out.println("File cannot be read properly.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not inside this application.");
        }
    }
}