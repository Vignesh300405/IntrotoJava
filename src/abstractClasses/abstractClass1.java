package abstractClasses;

public class abstractClass1 {
    public static void main(String[] args) {
        abstractClass3 ab1 = new abstractClass3();
        ab1.setId(1);

        abstractClass4 ab2 = new abstractClass4();
        ab2.setId(2);

        //abstractClass2 ab0 = new abstractClass2(); Does not work because class is abstract.

        ab1.run();


    }
}
