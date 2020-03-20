package PassingByValue;

public class PassingByValue {
    public static void main(String[] args) {
        PassingByValue pbv1 = new PassingByValue();

        //Scope of this variable 'i' is in the psvm. This includes primitive types.
        int i = 1;
        System.out.println("1. The value is: " + i);
        pbv1.hello1(i);
        System.out.println("4. The value is: " + i);

        //This includes objects. and the scope of 'psv1' is inside the psvm.
        System.out.println(); //Creates new line.
        PassingByValue1 psv1 = new PassingByValue1("Hello ");
        System.out.println("1. The object's name is " + psv1);
        pbv1.hello1(psv1);
        System.out.println("4. The object's name is " + psv1);
    }

    //The scope of this variable 'i' is in the hello1 method.
    private void hello1(int i) {
        System.out.println("2. The value is: " + i);
        i = 8;
        System.out.println("3. The value is: " + i);
    }

    //Method Overloading: Can have methods with same name inside a class as long as they have different parameters.
    //Parameter 'pbv1' can be used in this form only inside the hello1 method with the 'pbv1' parameter.
    private void hello1(PassingByValue1 pbv1) {
        System.out.println("2. The object's name is " + pbv1);

        pbv1 = new PassingByValue1("World!");

        System.out.println("3. The object's name is " + pbv1);
    }
}