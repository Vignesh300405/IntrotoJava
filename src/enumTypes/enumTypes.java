package enumTypes;



public class enumTypes {

    //Enum automatically numbers the values in itself, rendering this useless.
    //public static final int DOG = 0;
    //public static final int CAT = 1;

    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        switch(animal) {
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
        }

        //Gives the toString name.
        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        //This is the name given in the enum to the object DOG.
        System.out.println(Animal.DOG.getName());

        Animal animal1 = Animal.valueOf("CAT");
        System.out.println(animal1);
    }
}
