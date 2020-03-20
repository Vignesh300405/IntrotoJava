package Methods.basicMethods;

class toStrings {
    private String hello;
    private String world;

    public toStrings(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hello).append(world);
        return sb.toString();
    }
}


class inheritance1 {

    //Non-private variables from the class which is extended from trickles down to the classes that extends from it.
    protected String name = "Hello World!";

    public void start() {
        System.out.println("Start.");
    }

    public void stop() {
        System.out.println("Stop.");
    }
}

//When a class extends from another one, it inherits all of its already existing methods, but it can add its own individual new methods.
class inheritance2 extends inheritance1 {
    public void sputter() {
        System.out.println("Sputtering.");
    }

    //The class that extends could override a method from the other class by creating a method of the same name with either a different function or none at all.
    //@Override checks if the method is really overwriting another one from the extended class.
    @Override
    public void start() {
        System.out.println("Starting " + name);
    }
}

//Creating an interface file within the package allows for a class which "implements" the interface file and share methods when a class does not want to share all classes with other classes.
//
class interface1 extends interface2 implements Shared {

    //Method from interface file.
    @Override
    public void sharedInterface() {
        System.out.println("This is a shared interface named: " + name);
    }

    public void start() {
        System.out.println("Started " + name);
    }
}

class interface2 implements Shared {

    public String name = "John";

    @Override
    public void sharedInterface() {
        System.out.println("This is a shared interface named: " + name);
    }
}

public class basicMethods {

    public static void main(String[] args) {
        //toString method
        toStrings ts1 = new toStrings("Hello ", "World!");
        System.out.println(ts1);

        //inheritance and extending classes.
        inheritance1 ih1 = new inheritance1();
        ih1.start();
        ih1.stop();

        inheritance2 ih2 = new inheritance2();
        ih2.start();
        ih2.stop();
        ih2.sputter();

        //Polymorphism and Upcasting
        //Objects can be created with a type of a parent class and be set equal to a child class, but can only run the methods shared in name only by both classes.
        inheritance1 ih3 = ih2;
        //The specific method run by this object is determined by what object the object is set equal to. (So inheritance2 start method runs).
        ih3.start();
        //An object can only run the classes which are in the class of the named object (inheritance1), not from the set object's class.
        ih3.stop();
        //Does not work because the method sputter is exclusively in inheritance1 instead of inheritance2.
        //ih3.sputter();

        //Downcasting allows for an object of the parent class to execute methods from the child class by making an object of the child class to use with the same properties as the object from the parent class.
        inheritance1 ih4 = ih2;
        //Casting needs to be done to verify that this action is being done.
        inheritance2 ih24 = (inheritance2) ih4;
        ih24.sputter();



        //Interfaces and Implements
        interface1 int1 = new interface1();
        int1.start();
        //Objects created as the name of the interface (Shared) can only do the functions specified in the interface file.
        Shared shared1 = new interface2();
        shared1.sharedInterface();

        //An interface object (shared2) can be set equal to the methods which can be done by another object which "implements" that interface but can only conduct methods from the interface file.
        Shared shared2 = int1;
        shared2.sharedInterface();

        outputInterface(int1);


    }
    //Methods could be made requesting a parameter with a type of an interface (Shared) and type in any object with that interface "implemented" and run any method in that interface.
    public static void outputInterface(Shared shared) {
        shared.sharedInterface();
    }
}
