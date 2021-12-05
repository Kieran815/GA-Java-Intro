package day02.demoExceptions;

import java.util.ArrayList;

public class ExceptionDemo {
    public static void main(String[] args) {
/*
         checked exception: programmer forced to handle
        int x = "hello";

        int[] intArray = new int[]{1,2,3};

        System.out.println(intArray[0]);
        // unchecked error
        System.out.println(intArray[100]);
        System.out.println("After the error");
*/

        // add `try/catch` blocks to handle exceptions
        /*
        try {

            // Your code goes here.
        } catch(Exception e) {
            // Execute this code if an error occurs.
        }
        */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kieran");
        arrayList.add("Suresh");
        System.out.println(arrayList.get(0));
        // throws an error: `Index 100 out of bounds for length 2`
        // this will break the code
//        arrayList.get(100);
        // use the try/catch to catch exceptions
        try { // "We know something can go wrong...
            arrayList.get(100); // so try this code
        } catch (Exception e) { // if you get an error
            System.out.println("error: " + e); // then do this; printing the `e` will kick out the error message
        } // app won't crash because it caught the error
        arrayList.add("Link"); // item will still get added
        System.out.println(arrayList); // code will still run
    }
}
