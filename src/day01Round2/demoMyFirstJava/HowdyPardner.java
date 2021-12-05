package day01Round2.demoMyFirstJava;

import jdk.swing.interop.SwingInterOpUtils;

// All java files must be defined as a `class`
// `class` Definition must match name on file
public class HowdyPardner {

    // all Java Programs require a `main` method
        // `main` is the Entry Point of the program
        // `main` is automatically invoked when you run the file
        // `main` is place INSIDE the `class` definition

    // ELEMENTS OF THE `main` METHOD
        // `public`/`private`
            // `public` declares that the attached method is available anywhere
            // `private` is ONLY AVAILABLE on other members of the class (i.e. `main`, other methods, etc.)

        // `static`/`instance`
            // `static` indicates that the method belongs to the `class` itself/directly
            // `instance` indicates that the method belongs to the OBJECT the `class` creates when it is invoked

        // `void`
            // Java Functions/Methods indicate the value TYPE the method will return
            // Java Functions REQUIRE the TYPE of output in the definition to ENABLE FUTURE TYPE CHECKING
                // (i.e. - 'int', 'char', `String`, `Integer`, etc.

        // 'main`/`name`
            // name for function to be invoked by

        // `args` - type and param name
            // specify the `type` of the input params (arguments)
            // specify the name of the params (to specify in the function what to call);

    public static void main(String[] args) {
        System.out.println("Howdy Pardner");

        // DATA TYPES:

        // ***** Primitive Data Types *****
            // used to store single data types
            // Java types data based on data size:

        /*
        byte = 1 byte;      Numbers Range: [-128, 127];
        short = 2 bytes;    Numbers Range: [-32_000, 32_000];
        int = 4 bytes;      Numbers Range: [-2Billion, 2Billion];
        long = 8 bytes;     Numbers Range: [-2billion > number > 2Billion];
        float = 4 bytes;    Decimal type to 6 places;
        double = 8 bytes;   Decimal type to 12 places;
        char = 2 bytes;     Single Characters (alphanumeric);
        boolean = 1 byte;   True/False;
         */

        // KNOWLEDGE CHECK
        byte licksToCenterOfTootsiePop = 3;
        String home = "Frankfort, IL";
        float coneAtCreamery = 6.99F; // add `F` to `float` and `L` to `long`

        // When working with expected decimal numbers, all involved arguments must be specified as `float`:
        // otherwise, the below equation will output an `int`:
        float num1 = 5 / 2;
        System.out.println("num1 passed integers: 5 / 2 = " + num1);

        // `float`s return up to 6 decimal places
        float num2 = 5F / 2F;
        System.out.println("num2 passed floats: 5F / 2F = " + num2);

        // `double`s return up to 12 decimal points for higher accuracy than `float`s
            // because of this, Java's default is `double`
        double num3 = 5D / 2D;
        System.out.println("num3 passed doubles: 5D / 2D = " + num3);

        // Java also has a `Math` class for complex operations:
        System.out.println("3 to the 2nd with `Math`: " + Math.pow(3,2));
        System.out.println("Square Root of 4 with `Math`: " + Math.sqrt(4));
        System.out.println("Random Number between 0 and 1 with `Math.random(): " + Math.random());

        // Random Number in a Range:
//        int range = Math.abs(max - min) + 1;
        int range = Math.abs(9 - 1) + 1;
        System.out.println("Random Number between 1 - 10: " + (Math.random() * range) + 1);

        // ***** Object Data Types *****
            // OBJECTS ARE PASSED BY REFERENCE
                // Object variables contain references to where the data is stored on the computer
                // Object data can be manipulated using methods
            // Start with a Capital Letter
            // contain attributes and methods

        // a variable assigned to an Object is give a number that references WHERE a value can be found in the
        // computer memory, but NOT A COPY of the values themselves;
            // it is a reference to the data object that contains all the info and methods of that class;

// ** Classes and Objects start with Capital Letters; Primitives and Methods start with lower case letters;

        // `char` and `String`:
        // `char` is a primitive data type
        // `String` is an object
            // a COLLECTION of characters (`char`s)

        // String str = "abc" == char data[] = {'a', 'b', 'c'};

        // `String` can be assigned like a primitive:
        String a = "I'm a String";
        System.out.println("String a = " + a);
        // Objects have pre-defined methods. Example:
        System.out.println("\"hello\".length() = " + "hello".length());
        System.out.println("First Character of hello using `charAt(0)`: " + "hello".charAt(0));
        System.out.println("Replace Part of a String:");
        System.out.println("Replace: \"hello world\".replace(\"hello\", \"goodbye\"): " + "hello world".replace("hello", "goodbye"));

        // CONVERTING BETWEEN DATA TYPES:

        // converting smaller types to larger types is done automatically.
        System.out.println("Converting Smaller Types to Larger Types uses Implicit Casting:");
        int b = 100;
        double c = b;
        System.out.println("100 Converted from int: (" + b + ") to double: (" + c + ") happens automatically.");

        System.out.println("Converting Larger Types to Smaller Types requires Explicit Casting");
        double d = 100.7;
        int e = (int) d;
        System.out.println("double d = 100.7; int e = (int) d;");
        System.out.println("100.7 Converted from double: (" + d + ") to int: (" + e + ") must be clearly marked.");

        // EXERCISE:
        // TODO: Complete the following variable declarations.

        System.out.println("Exercise Output:");

        short oldYear = 1950;
        short nowYear = 2016;

        short averageFamilyIncome1950 = 3_300;
        short medianHomePrice1950 = 7_354;
        short tuitionYale1950 = 600;
        short roomAndBoardYale1950 = 456;
        short otherExpensesYale1950 = 376;

        int averageFamilyIncome2015 = 51_017;
        int medianHomePrice2015 = 188_900;
        int medianHomePriceManhattan2013 = 855_000;
        int tuitionYale2015 = 45_800;
        short roomAndBoardYale2015 = 14_000;
        short otherExpensesYale2015 = 5_552;

        String intro = "To understand how purchasing power has changed in the past 65 years, it is useful to compare the family income to the cost of goods and services, such as housing and education.";


        // TODO: Find and fix a mistake in the following.

        /*
        if (intro == "A long time ago in a galaxy far, far away") {
            System.out.println("May the force be with you.");
        } else {
            System.out.println(intro);
        }
        */

        String str = "A long time ago in a galaxy far, far away";
        if (intro == str) {
            System.out.println("May the force be with you.");
        } else {
            System.out.println(intro);
        }

        // TODO: Use a print statment to add a newline or <br>.
        System.out.println("New Line: \n");
        System.out.println("After New Line.");

        // TODO: Complete the following basic mathematical calculations.

        // Divide median home price by annual income and print each result to the command line.
        // Make 3 variables: homeRatio1950, homeRatio2015, homeRatioNYC2015

        // Find the total cost of university education for 1950 and for 2015 and print result to the command line.
        // Then divide university cost by annual income for both: educationRatio1950, & educationRation2015. Print the results to the command line.

        // TODO: Convert the following String into a number.

        int averageDebt1950 = Integer.parseInt("2000");

        // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/'s in the String with the proper variables.

        short creditCardDebt2015 = 15_355;
        int totalDebt2015 = 129_579;
        String debt = "Debt is an unwelcome guest at the table in many American households. Back in the late 1940s and early 1950s, the average American consumer had less than $/*something*/ in total personal debt. Today the average U.S. household with debt carries $/*something*/ in credit card debt and $/*something*/ in total debt.";

        // TODO: Using one line of code, determine if the following string contains the word "table". Print the result to the command line.
        boolean hasTable = debt.contains("table");

        // TODO: How has the ratio of debt to income changed in the past 60 years?
        System.out.println(averageFamilyIncome1950);
        System.out.println(((Object) averageDebt1950).getClass().getName());
        System.out.println(((Object) averageFamilyIncome2015).getClass().getName());
        System.out.println(((Object)averageDebt1950).getClass().getName());
        System.out.println(((Object) totalDebt2015).getClass().getName());

        double ratio1950 = averageDebt1950 / averageFamilyIncome1950;
        System.out.println((ratio1950));
        double ratio2015 = totalDebt2015 / averageFamilyIncome2015;
        System.out.println(ratio2015);

        // EXTRA: Round the answer to two decimal places.
        double debtRatio1950twoDecimals = Math.round(ratio1950 * 100.0) / 100.0;
        System.out.println("debtRatio1950twoDecimals = " + debtRatio1950twoDecimals);
        double debtRatio2015twoDecimals = Math.round(ratio2015 * 100.0) / 100.0;
        System.out.println("debtRatio2015twoDecimals = " + debtRatio2015twoDecimals);

        // Loops Review: do FizzBuzz
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if ( i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }


        /// ********************** METHOD CALLS ****************************
        getSum(); // can run, but not sout because the method does not return a value;

        System.out.println("Value RETURNED from `returnSum()`: " + returnSum()); // can run and sout because method returns a value

        // Practice Calls
        System.out.println(divide152By(3));
        System.out.println(divide152By(43));
        System.out.println(divide152By(8));

        System.out.println("Trans: " + transmogrifier(5, 3, 2));
        System.out.println("Trans: " + transmogrifier(13, 12, 5));
        System.out.println("Trans: " + transmogrifier(42, 13, 7));
    }

    // METHODS AND SCOPE LESSON:
    // *** Notes Below ***
        /*
        Let's look at what each part of this method does. We'll start with the basics, which we covered a bit in explaining the main method.

        //<modifiers or visibility>  <return type>   <method name>    (  <parameters>  )     <exception list>
        public                       void            interestingMethod(  String input  )     throws IOException
        {
            System.out.println("I am making " + input + " interesting.")
            <method body>
        }
        */

        /* NOTES ON METHOD ANATOMY
            // MODIFIERS:
                // Modifiers are used to modify how a method can be CALLED

                // ACCESS MODIFIERS:
                    // `private` : only visible to the class it is created in
                    // `protected` : visible to the PACKAGE and ALL-SUB CLASSES
                    // `public` : visible to the entire program
                // Note: When no access modifier is specified, the method is only visible to hte class and package;

                // NON-ACCESS MODIFIERS:
                    // `static` : for creating CLASS methods and variables
                    // `final` : for making something permenant
                    // `abstract` : for creating abstract classes and methods
                    // `synchronized` : for creating threads
            // **** for now, use public static for all methods ****

            // RETURN TYPE:
                // a method can return a value, but the type of that value must be specified
                    // tells calling method what to do with the value by type
                    // *** see `getSum()` and `returnSum()` below ***

            // NAME:
                // whatever you call your method. Use camelCase

            // PARAMETERS:
                // parameters are placeholders in the code that get filled in when arguments are passed.
                // if a method declares a PARAMETER, that parameter is REQUIRED TO BE SENT AS AN ARGUMENT from the calling method.
                // It's also possible to have a return type for an unknown number of arguments
                // *** see `myMethod()` below ***
        */


        public static void getSum() {
            int sum = 2 + 2;
            System.out.println("Printed from `getSum`, but not returned: " + sum);
        }

        public static int returnSum() {
            int sum = 2+2;
            System.out.println("Printed from `returnSum()`: " + sum);
            return sum;
        }
        // if a data type has been specified, that type must be returned (or null), or the code will not compile;

        // Return Type for Unknown Number of Args
        public static void myMethod(String[] vars) {}

        /*
        * Write a method called `divide152By()`.
        * It should accept a number as an argument and divide 152 by the given number.
        *  For example, the divide152By result of 2 — 152/2 — is 76.
        *  Your method should return the result.
        */
    // used `double` bc higher accuracy
        public static double divide152By(double num) {
            return 152 / num;
        }

        // Note: Passing `integer`s and returning a `double`
        public static double transmogrifier(int a, int b, int c) {
            return Math.pow((a * b), c);

        }

}
