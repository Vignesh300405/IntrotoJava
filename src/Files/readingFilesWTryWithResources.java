package Files;


class readingFiles1 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Close!");
        //Calls an exception with the message "Oh no!".
        throw new Exception("Oh no!");
    }
}

//This method of reading files lessens the clutter of FileReader method and all of its exceptions.
public class readingFilesWTryWithResources {
    public static void main(String[] args) {
        try(readingFiles1 rf = new readingFiles1()) {

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
