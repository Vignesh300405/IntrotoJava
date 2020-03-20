package abstractClasses;

//An abstract class like this makes it so that a class which is only extended to other classes to be used cannot be created into its own object.
//Abstract classes extended to child classes makes the methods of the class fundamentally part of the child class, while interface acts as just adding methods.
//There can only be one class extended to a child class but multiple interfaces.
public abstract class abstractClass2 {
    private int id;

    //Alt+Insert allows you to get getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //An abstract method needs to be implemented in its child classes, but will not be in the parent class.
    public abstract void start();
    public abstract void end();
    public void run() {
        start();
        end();
    }

}
