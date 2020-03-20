package pppClasses;

public class class1 {

    //Bad practice as it is recommended to seal off variables to control their use cases.
    public String name;

    //Better practice as variable cannot be changed outside of this line.
    public final static int ID = 7;

    //Private variables cannot be accessed or modified outside of its class, not even to a class that extends from it.
    private String str;

    //Protected variables can be accessed or modified in the original class and classes that extend from it as well as classes in its package.
    protected int size;

    //Variables which are neither public, private, nor protected are by default usable anywhere in the package.
    int hello = 21;

    public class1() {
        name = "John";
        this.str = "Hello World!";

        this.size = 5;
    }
}
