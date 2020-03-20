package serialization;

import java.io.Serializable;

public class Transient implements Serializable {

    //Making a variable transient means that it is not serialized, so the value stays the same as when first initialized.
    //This is helpful when the variable cannot be serialized to make sure its not serialized.
    private transient int id;
    private String name;

    //No need to serialize a static field because it is the same regardless.
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Transient.count = count;
    }

    //When deserializing an object, it does not run the constructors.
    public Transient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transient {" +
                "id=" + id +
                ", name='" + name + "', count=" + count +
                '}';
    }
}
