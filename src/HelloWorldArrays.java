import java.util.Scanner;

public class HelloWorldArrays {

    public static void main(String[] args) {
        int[] values = new int[3];
        int value = 0;
        for(int i=0; i<values.length; i++){
            Scanner intValue = new Scanner(System.in);
            System.out.println("Type a number: ");
            value = intValue.nextInt();
            values[i] = value;
        }


        for(int i=0; i<values.length; i++) {
            System.out.println("Number " + i + " in array: " + values[i]);
        }

        //For loop which does the for loop the amount of times of the length of the array.
        for(int valuess: values) {
            System.out.println(valuess);
        }

        //Multi-dimensional arrays
        int[][] multiDimensionalValues = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3},
                {1,2},
                {1}
        };

        //r is rows and c is columns Ex: [1][5] = 5
        for(int r=0; r < values.length; r++) {
            for(int c=0; c < multiDimensionalValues[r].length; c++) {
                System.out.println(multiDimensionalValues[r][c]);
            }
        }
    }
}
