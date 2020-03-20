

public class CastingNumbers {

   public static void main(String[] args) {
       byte byteValue = 8;
       short shortValue = 55;
       int intValue = 888;
       long longValue = 9999;

       //Decimal values automatically set to double, so f after a decimal number allows it to be a float. Also the number can be casted to be a float.
       float floatValue = 1818.5f;
       float floatValue2 = (float) 999.5;
       double doubleValue = 881.5;

       //In order to transport numbers in between types of numbers, casting is done by placing the format of what the number is being changed into in parentheses before the value getting changed.
       intValue = (int) longValue;
       System.out.println(intValue);

       //Without any casting, an integer value to a double value is automatically formatted by Java.
       doubleValue = intValue;
       System.out.println(doubleValue);

       //On the other hand, a double value to an integer value has to be cast and it will cut off the decimal parts automatically.
       intValue = (int) doubleValue;
       System.out.println(intValue);

       //When a value is overloaded past its capacity for holding numbers, the minimum value is set for the value.
       byteValue = (byte) 129;
       System.out.println(byteValue);
   }

}
