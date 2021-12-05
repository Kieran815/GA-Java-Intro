package day02.demoArray;

import java.util.Arrays;

public class ArrayManipulationDemo {
    public static void main(String[] args) {
        int[] primeNumbers = {5, 3, 11, 7, 2};
        int firstPrime = primeNumbers[0];
        System.out.println(firstPrime); // output: 5
        System.out.println(primeNumbers); // Output: [I@7cf10a6f; prints as object reference;

        // CONVERT ARRAY TO STRING
        System.out.println(Arrays.toString(primeNumbers));
        Arrays.sort(primeNumbers); // sort values in array
        System.out.println(Arrays.toString(primeNumbers));
        System.out.println((primeNumbers.length));

        int indexOf11 = Arrays.binarySearch(primeNumbers,11);
        System.out.println("Index of 11: " + indexOf11); // Output: 4
        // System.out.println(primeNumbers[12]); // Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 12 out of bounds for length 5 at day02.demoArray.ArrayManipulationDemo.main(ArrayManipulationDemo.java:20)

    }
}
