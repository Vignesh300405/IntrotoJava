package Methods.basicMethods;


class Hello {
    private int id;
    private String name;

    public Hello(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hello other = (Hello) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
public class equalsMethod {
    public static void main(String[] args) {
        Hello hello1 = new Hello(1,"John");
        Hello hello2 = new Hello(1,"John");

        //Primitive method of seeing if two objects are equal to each other. This only compares if objects are the same object. Works fine with integers and primitive types.
        System.out.println(hello1 == hello2);

        //The equals method with proper configuration and hashCode method allow for the objects to properly be equal to each other based on parameters.
        System.out.println(hello1.equals(hello2));

    }
}
