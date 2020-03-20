import java.util.Scanner;

class Data {
    //Instance variables (data)
    //Can make these variables private to encapsulate them and use a structure like the getNumber and number methods to access variables.
    public int number;
    public int square;
    public int cube;
    //When a variable is static, there is only one copy for the entire class and only that individual copy can be called and be given a value for outside the class.
    //Static cannot access instance variables.
    public static String onlyClass;

    //Final variables cannot be changed anywhere else in the code.
    public final static int noChange = 7;


    // A void method cannot return any value.
    void methods() {
        for(int i=0; i < number; i++) {
            System.out.println("This is a method class with the number " + number + " which squared is " + square);
            System.out.println(square + " cubed is " + cube);
        }
    }

    //Void needs to be exchanged with a variable type in order to be able to return a value with return var.
    public int squared() {
        int numbers = number * number;
        return numbers;
    }

    /*Variables of any type can be placed as parameters in a method, which can be requested in the code when the method is called for and then be used in the
    method itself. Can add more than one parameter.*/
    public int cubed(int x) {
        int triples = x * x * x;
        return triples;
    }

    //Allows to set variable when private.
    public void setNumber(int newNumber) {
        number = newNumber;
    }

    //Alternative method for setNumber. this.number means the instance variable itself. It refers to itself.
    /*
    public void setNumber(int number) {
        this.number = number;
    } */

    //Create a method in order to use same variable name inside other functions.
    public int number() {
        return number;
    }

    /*A method of the same name as the class (called a constructor) contains actions that are done by default whenever an instance of the class is created
    (when the new and class name is typed).*/
    public Data() {
        //This with parameters in parentheses calls for another constructor inside a constructor.
        this(1);
        System.out.println("What number do you choose?");
    }

    //A constructor with different parameters than the other constructor would be used whenever a valid parameter is typed between the parentheses.
    public Data(int x) {
        System.out.println("You chose " + x + " last time. Which number do you choose this time?");
    }

    //Whenever static is added, that means it only can be accessed as a singular thing from the class.
    public static void staticMethod() {
        System.out.println("This method is called for the class as a whole, not from an object of the class.");
    }
}

public class HWClassesandObjects {

    public static void main(String[] args) {
        //Call for the class and names the new instance of the data
        Data data1 = new Data();
        Scanner numbeScanner = new Scanner(System.in);
        int numbe = numbeScanner.nextInt();
        data1.number = numbe;
        //Calls for the variable numbers from the method squared.
        data1.square = data1.squared();
        //data1.square is the parameter which is given to the method cube to be used.
        data1.cube = data1.cubed(data1.square);
        //Calls for the method inside the class.
        data1.methods();

        //Uses same variable name to simplify code.
        int number = data1.number();
        System.out.println(data1.number());
        System.out.println(number);

        //Shows the usage of a second constructor by inserting a parameter.
        Data data2 = new Data(data1.number);
        /*Uses a setter to update the variable number in a simpler fashion. setNumber stores the number and number returns that. This allows the variables to
        become private and hide the variables */
        data2.setNumber(data1.square);
        System.out.println(data2.number());

        //Static variable can only be called and given values as a single entity.
        Data.onlyClass = "This is a singular part of this method.";
        System.out.println(Data.onlyClass);

        Data.staticMethod();

        numbeScanner.close();
    }
}
