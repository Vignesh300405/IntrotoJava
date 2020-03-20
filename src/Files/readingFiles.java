package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        //Directly from saved location of file: String fileName = "C:\\Users\\vigne\\Downloads\\HelloWorld.txt";
        //File is copied into the same directory and then used as that copy in the directory.
        String fileName = "src\\HelloWorld.txt";

        File txtFile = new File(fileName);
        //When prompted add the first thing that comes up, which adds "throws FileNotFoundException".
        Scanner in = new Scanner(txtFile);

        //How to print out integers from the text file.
        int value = in.nextInt();
        System.out.println("Read value: " + value);

        //This removes the extra line in between set because of an arbitrary line added which cannot be read by nextInt.
        in.nextLine();

        //Prints out every line of the text file.
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }

        in.close();


    }
}
