package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Warning: creates a new file every time it runs.
public class CreatingFiles {
    public static void main(String[] args) {
        File file = new File("src\\text.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {
            bw.write("This is line number one.");
            bw.newLine();
            bw.write("This is line number two.");
            bw.newLine();
            bw.write("This is line number three.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
