package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class serialize1 {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fis = new FileInputStream("people.bin")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            serialize s1 = (serialize) ois.readObject();
            serialize s2 = (serialize) ois.readObject();

            ois.close();

            System.out.println(s1);
            System.out.println(s2);
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found.");
        } catch (IOException e) {
            System.out.println("File cannot be read properly.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not inside this application.");
        }
    }
}