import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int output = 0;
        for(int i=0; i < 5; i++){
            //Do-while loop
            do {
                System.out.println("Type some number (hint: its 5): ");
                output = input.nextInt();
            }
            while(output != 5);
            System.out.println("Got 5!");
        }
        //Always close a scanner.
        input.close(); */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Type a number: ");
        int output2 = input2.nextInt();
        //Switch loop
        switch(output2) {
            case 5:
                System.out.println("Got 5 again!");
                break;

            default:
                System.out.println("Try again next time!");
        }
        input2.close();
    }
}
