package Files;

import java.io.*;

public class readingFilesWFileReader {
    public static void main(String[] args) {
        //When the file name is wrong, it gives a NullPointerException
        File file = new File("src\\Files\\test.txt");

        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        //This happens last in the workings of the file no matter what.
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Cannot close file: " + file.toString());
            } catch (NullPointerException ex) {
                //File was probably never opened.
            }

        }


    }
}
