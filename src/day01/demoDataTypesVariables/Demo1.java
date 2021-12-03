package day01.demoDataTypesVariables;

public class Demo1 {
    public static void main(String[] args) {
/*
        // compiled languages require a data type as part of the variable declaration
        // `PRIMITIVE` data types have NOT methods and are sent to the STACK
        // the type declaration will be lower case.
        int x = 20; // integer
        double price = 100.00; // decimal
//      // `WRAPPER/OBJECT` data types have methods and are sent to the HEAP
        // `OBJECTS` ALWAYS live inside the  HEAP
        String name = "Kieran"; // string; uses `String` class to create an object
*/
        // a `byte` is 8-bits, min @ -128, max @ 127
        // 128 is the threshold for moving data storage sizes
        byte aByte = 127;
        int anInt = 1000;

        // max number for `short` number
        short aShort = 32767;

        // `long` is faster than `double` for large processing
        // defaults to `int` UNLESS you add an `L` to the end of the number
        // used in large processing
        long aLong = 1000000000000000000L;
        double aDouble = 22.3;

        // `float` allows for decimals
        // apply `f` to allow for decimals on full integers to return float numbers.
        float aFloat = 11.5f;
        boolean aBoolean = true;
        char aChar = 'A'; // `char` can use `''`

    }
}
