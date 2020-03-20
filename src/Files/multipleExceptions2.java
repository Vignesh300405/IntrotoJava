package Files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class multipleExceptions2 {
    public void run() throws IOException, ParseException {
        //throw new IOException();

        throw new ParseException("Error in line 10.", 2);
    }

    //FileNotFoundException is a subclass of IOException.

    public void input() throws IOException, FileNotFoundException {

    }
}
