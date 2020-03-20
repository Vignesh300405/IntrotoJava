package serialization;

import java.io.Serializable;

//To make a class serializable, you have to implement "Serializable".
public class serialize implements Serializable {
    private int id;
    private String name;

    public serialize(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Serialize {" + "id=" + id +", name='" + name + '\'' +'}';
    }
}
