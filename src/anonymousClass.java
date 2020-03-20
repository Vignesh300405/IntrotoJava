class Hello {
    public void start() {
        System.out.println("Hello");
    }
}

interface World {
    public void end();
}

public class anonymousClass {
    public static void main(String[] args) {

        Hello hello1 = new Hello() {
            //This notation allows for overriding methods stated in the class of the object.
            @Override public void start() {
                System.out.println("Hello World!");
            }
        };
        hello1.start();

        World world1 = new World() {

            @Override
            public void end() {
                System.out.println("Hello World!");
            }
        };
        world1.end();
    }
}
