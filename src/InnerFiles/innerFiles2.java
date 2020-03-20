package InnerFiles;

public class innerFiles2 {
    private int id;

    public innerFiles2(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting item " + id);
        Hello hello = new Hello();
        hello.think();
        World world = new World();
        world.move();

        String name = "John";
        class Temp {
            public void jump() {
                System.out.println("Object " + id + " is jumping.");
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.jump();
    }

    //Nested class example. Can use variables inside class and can be used elsewhere in that inner class.
    private class Hello {
        public void think() {
            System.out.println("Item " + id + " is thinking.");
        }
    }

    //Static inner class example. Cannot use variables in parent class that are not static. Mainly used to organize classes.
    static class World {
        public void move() {
            System.out.println("Item is moving.");
        }
    }
}
