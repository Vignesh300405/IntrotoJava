public class HWStrings {

    public static void main(String[] args) {

        //Inefficent as "text" is replaced with a new string of the same name with the added text everytime.
        String text = "";
        text += "Hello ";
        text += "World!";
        System.out.println(text);

        //StringBuilder is the same as string but when appended to, it appends to the original string directly.
        StringBuilder sb = new StringBuilder("");
        //This is how to append to a StringBuilder.
        //.append directly after the first instance of appending allows for continuous appending.
        sb.append("Hello World! ").append("How are you today? ");
        //*name*.toString() is used to recall the StringBuilder.
        System.out.println(sb.toString());

        //Formatting     \n is new line     \t is a tab.
        System.out.println("Hello World!\nHow are you?\tI'm good!");
        System.out.print("Hello "); //print instead of println means the next printed thing will be on the same line.
        System.out.println("World!");

        //f allows for formatting with %d being the variable which can be changed with the value after a comma. Does not create new line after.
        //Adding a number between the percent and d makes the space after the character that amount large before it. A negative number makes that space after it.
        //Formatting integers %d
        System.out.printf("Hello World! %d %2d\n", 5, 6);

        for(int i=0; i<11; i+= 2) {
            //Formatting strings %s
            System.out.printf("%2d: %s\n", i, "Hello World!");
        }

        //Formatting floating point numbers %f. .Number between percent and f changes amount of decimal places printed.
        //Placing a number before the dot puts space before number. But it accounts for the entire length of number itself.
        System.out.printf("Amount of 'Hello World!'s: %5.2f", 5.555);
    }
}
