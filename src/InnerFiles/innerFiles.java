package InnerFiles;

public class innerFiles {
    public static void main(String[] args) {
        innerFiles2 if1 = new innerFiles2(1);
        if1.start();

        //Syntax to make an object of the parent class gain access to methods in an inner class.
        //innerFiles2.Hello hello = if1.new Hello();
        //hello.think();
    }
}
