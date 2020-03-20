package enumTypes;

public enum Animal {
    DOG("Hello"), CAT("World");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal's name is: " + name;
    }

}
