package Files;

import java.io.*;

//Condensed version without using FileReader, which takes advantage of a Try with Resources to shorten the code.
public class readingFilesWTryWithResources2 {
    public static void main(String[] args) {
        File file = new File("src\\Files\\test.txt");

        //This next line is a try with resources, with the buffered reader made from a file reader being used in the try.
        //Try with Resources automatically closes the file.
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        } catch (FileNotFoundException e) {
            System.out.println(file.toString() + " cannot be found.");
        } catch (IOException e) {
            System.out.println("Cannot read " + file.toString() + "properly.");
        }

    }
}
