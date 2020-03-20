package GenericClass;

import java.util.ArrayList;
import java.util.HashMap;



class Hello {

    @Override
    public String toString() {
        return "Hello";
    }

    public void start() {
        System.out.println("Hello ");
    }
}

class World extends Hello {

    @Override
    public String toString() {
        return "World";
    }

    public void end() {
        System.out.println("World.");
    }
}

public class genericClass {
    public static void main(String[] args) {
        //More advanced array.
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("pineapple");

        String fruit = arrList.get(1);
        System.out.println(fruit);

        //HashMap has the same purpose as ArrayList, but allows for more than one type argument.
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //ArrayList does not need type argument to be said twice and can even use a class as a type argument.
        ArrayList<Hello> hellos = new ArrayList<>();



        ArrayList<Hello> list1 = new ArrayList<>();
        list1.add(new Hello());
        list1.add(new Hello());

        showList(list1);

        //An ArrayList with a type parameter of a child class cannot be run through a class of a function with a type parameter of its ArrayList being that of the parent function.
        ArrayList<World> list2 = new ArrayList<>();
        list2.add(new World());
        list2.add(new World());

        //Will not work when there isn't a wildcard (?) type placed.
        showList(list2);

        showList2(list1);


    }
    //A wildcard(?) can be placed instead of a type parameter to allow any type. This disallows only using certain types of Objects into the class.
    //If ? "extends" a class, then it allows for that class-specific methods to be implemented in the class.
    public static void showList(ArrayList<? extends Hello> list) {
        //The object type has to be changed to Object when only the wildcard (?) , which is what every class extends from.
        //When the ? "extends" to a class, then that class could be set as the type and therefore allow for the class's methods. (Ex: line 70)
        for(Hello value : list) {
            System.out.println(list);
            value.start();
        }
    }

    //Doing super for a class after the wildcard (?) makes it so that that class and all its superclasses (Hello and Object) can be accessed as well, but a consequence is that only actions which the Object class can do are allowed to be done in the class.
    public static void showList2(ArrayList<? super World> list) {
        //Can only use Object class.
        for(Object value : list) {
            System.out.println(list);
        }
    }
}
