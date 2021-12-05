package day02.demoArray;

import java.sql.Array;
import java.util.ArrayList;

/*
Independent Practice: Arrays and Array Lists (15 min)
Work through as many of the following challenges as you can in the
next 15 minutes. Each should be completed in its own method.

Find the Size
Create an array of type int.
Print the length of the array to the command line.

Concrete Jungle
Create an ArrayList of New York City wildlife.
Create a function that, given an ArrayList of strings, prints for each element:
"Today, I spotted a /Thing here/ in the concrete jungle."

Sum It Up
Create a method that, given an array of type int, returns the sum of the first
two elements in the array. If the array length is 1, just return the single
element, and return 0 if the array is empty (has length 0).

 */
public class IndependentPracticeArrays {

    public static void findSize(int[] array) {
        System.out.println(array.length);
    }

    public static void concreteJungle(ArrayList<String> animalArray){
        for (String animal : animalArray){
            System.out.println( "Today, I spotted an " + animal + " in the concrete jungle.");
        }
    }

    public static int sumItUp(int[] array){
        if (array.length == 1){
            return array[0];
        }
        else if (array.length == 0){
            return 0;
        }
        else {
            return array[0] + array[1];
        }
    }
}
