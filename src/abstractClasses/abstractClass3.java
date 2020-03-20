package abstractClasses;

public class abstractClass3 extends abstractClass2 {

    //Needs to implement start method because it is an abstract method in a parent class. An easier way of voiding ever class.
    @Override
    public void start() {
        System.out.println("Starting this.");
    }

    @Override
    public void end() {
        System.out.println("Ending this.");
    }
}
