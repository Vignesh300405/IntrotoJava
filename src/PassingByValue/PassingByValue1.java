package PassingByValue;

public class PassingByValue1 {
    private String name;

    public PassingByValue1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PassingByValue1 {" + "name='" + name + '\'' + '}';
    }
    
}
