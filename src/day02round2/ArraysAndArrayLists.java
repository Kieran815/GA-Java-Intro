package day02round2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayLists {
    public static void main(String[] args) {

        // **** ARRAYS ****
            // an ARRAY is a CONTAINER OBJECT that holds a FIXED number of values of a SINGLE TYPE
            // each ITEM in an array is called an ELEMENT, which can be accessed by its INDEX;
            // INDEX starts at 0

        // Declare an Array of integers:
        int[] anArray; // data type, followed by empty brackets to declare an array;
        anArray = new int[10]; // allocates memory for 10 slots of integer values;
        // assign elements to array indices:
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;
        anArray[5] = 6;
        anArray[6] = 7;
        anArray[7] = 8;
        anArray[8] = 9;
        anArray[9] = 10;

        // printing the array object itself returns the memory location:
        // Access elements:
        System.out.println("Printing the array object itself returns the memory location (below): \n" + anArray);
        for(int i = 0; i < anArray.length; i++) {
            System.out.println("Element at index " +  i + ": " + anArray[i]);
        }
        System.out.println("The array has a size of " + anArray.length);
        // access value of last item in array:
        System.out.println(anArray[anArray.length-1]);


        // MANIPULATING ARRAYS:
            // arrays can be initialized and created in one statement:
        // Shortened syntax: Assign variable, allocate memory, and initialize values all in one statement.
        String[] favThings = {
            "Dogs",
            "Cats",
            "Lexx"
        };
        System.out.println("My Favorite Things: " + Arrays.toString(favThings));

        // Less basic operations are performed by using METHODS from the ARRAY OBJECT:
            // initialize the array:
        int[] primeNumbers = {3, 13, 7, 11, 5, 7, 1, 2, 23, 19, 17};
            // get element at index:
        int firstPrime = primeNumbers[0];
        System.out.println("firstPrime = primeNumbers[0]: " + firstPrime);
            // print full array after converting to string:
        System.out.println("Arrays.toString(primeNumbers): " + Arrays.toString(primeNumbers));
            // sort an array
        Arrays.sort(primeNumbers);
        System.out.println("Arrays.sort(primeNumbers): " + Arrays.toString(primeNumbers));
            // get array length
        System.out.println(("primeNumbers.length: " + primeNumbers.length));
            // check array for value, returns `-1` if not found
            // NOTE: ONLY WORKS ON SORTED ARRAYS:
        int indexOf11 = Arrays.binarySearch(primeNumbers, 11);
        System.out.println("Check array for value using `.binarySearch`: \n Arrays.binarySearch(primeNumbers, 11):" + indexOf11);
        System.out.println("primeNumbers[6] = " + primeNumbers[6]);
        System.out.println("looking for 11, found value: " + primeNumbers[indexOf11]);

        // ERROR CHECKING:
        // use `if` to prevent errors and designate outputs in the event of a break
            // Example: 10 is not a prime number:
        int indexOf10 = Arrays.binarySearch(primeNumbers, 10);
        if (indexOf10 < 0) {
            System.out.println("Error Caught: 10 is not a prime number");
        }

        // ARRAYS ARE FIXED SIZES AND CANNOT BE ADDED TO. IT IS A PAIN IN THE ASS TO CREATE A NEW ARRAY OF A LARGER
        // SIZE AND COPY THE CONTENTS AND INITIALIZE THE ADDITIONAL ELEMENTS.

        // INSTEAD, USE COLLECTIONS:

        // **** COLLECTIONS ****
            // COLLECTIONS have more METHODS and will AUTOMATICALLY INCREASE IN SIZE AS NEEDED

        //  **** THERE ARE SEVERAL DIFFERENT COLLECTION CLASSES ****

        // *** ARRAY LISTS ***
            // convert `favThings` array to an `ArrayList`:
            // NOTE: data type of each element is defined in angle brackets `<>`
                // data type can be any OBJECT type
                // If you want to make an ArrayList of a primitive type, you need to use a
                // "boxed" version of that type in the angle brackets.
                // Example: `ArrayList<Integer>`
        ArrayList<String> favThings2 = new ArrayList<>();
            // add items to `ArrayList`:
        favThings2.add("Dogs");
        favThings2.add("Cats");
        favThings2.add("Family");
        favThings2.add("Pizza");

            // `ArrayList`s have methods, which make it easier to manipulate:
                // array lists don't need to be converted (`toString()` is called automatically)
        System.out.println("favThings2 = " + favThings2);

            // add items at specific index and move all other entries over:
        favThings2.add(0, "Family");
        System.out.println("Add items at specific index and move all other entries over: \n `favThings2.add(0, \"Family\")`: " + favThings2);

            // replace item in the specified index
        favThings2.set(3, "Coding");
        System.out.println("Replace Items at an index: `ArrayList.set(3, \"Coding\")`: " + favThings2);

            // search ArrayList for Value:
        int indexOfCats = favThings2.indexOf("Cats");
        System.out.println("Search ArrayList for Value: \n `ArrayList.indexOf(\"Cats\")`: " + indexOfCats);

        // PRACTICE:Create a list of five movies and iterate through it, printing each one to the command line.
            // *** SEE `printMovies()` BELOW `main`
        ArrayList<String> fiveMovies = new ArrayList<>();
        fiveMovies.add("Usual Suspects");
        fiveMovies.add("Sing");
        fiveMovies.add("Dr. Strange");
        fiveMovies.add("Dr.Strangelove");
        fiveMovies.add("Frozen");

        printMovies(fiveMovies);

        // INDEPENDENT PRACTICE:

        /*
        Create an array of type int.
        Print the length of the array to the command line.
        */
        int[] arrayOfNums = {1, 2, 3, 4};
        System.out.println("Length of `arrayOfNums`: " + arrayOfNums.length);

        /*
        Create an ArrayList of New York City wildlife.
        Create a function that, given an ArrayList of strings, prints for each element:
            "Today, I spotted a /Thing here/ in the concrete jungle."
        */
        ArrayList<String> nycWildLife = new ArrayList<>();
        nycWildLife.add("Crackhead");
        nycWildLife.add("Pimp");
        nycWildLife.add("Hooker");
        nycWildLife.add("Horse");

        todayISaw(nycWildLife);

        System.out.println(sumFirstTwo(arrayOfNums));
    }

    public static void printMovies(ArrayList<String> movieList) {
        // Regular `for` Loop:
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i));
        }

        // Enhanced `for` Loop:
            // Java syntax specifically for arrays and lists
                // (kind of like `for/in` from JavaScript)
        for (String movie : movieList) {
            System.out.println("Enhanced `for` Loop Output: " + movie);
        }
    }

    public static void todayISaw(ArrayList<String> animals) {
        for (String animal : animals) {
            System.out.println("Today I spotted a " + animal + " in the concrete jungle!!!");
        }
    }

    /*
        Create a method that, given an array of type int, returns the sum of the first two elements in the array.
        If the array length is 1, just return the single element, and return 0 if the array is empty (has length 0).
    */
    public static int sumFirstTwo(int[] arr) {
        if(arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + arr[1];
        }
    };
}
