// name of file should be same as name of class
// Java only allows ONE PUBLIC CLASS in a single file
// FOR COURSE, USE NEW FILE FOR EACH PUBLIC CLASS
package day01.demoMyFirstJava;

// `public` means class is accessible to any other file inside entire directory
// `private` means only available to the class it in
// if no `public`/`private`, java will default add `public`


public class DemoHelloWorld {
// `main` method
// java programs need an `execution point` to start running the program
    // `main` tells Java `This is where we run the code`
// `String[] args` accepts an array of string arguments
// `static` means `belongs to the class`
// `void` indicates the return value of the function, which in our case will be nothing at all.
    public static void main(String[] args) {
        // javas uses `System.out.println` instead of `console.log`
        // `""` is for strings, `''` is for single characters/letters
        System.out.println("What's Good?!?!");
    }
}

