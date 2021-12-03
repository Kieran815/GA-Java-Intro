package day01.demoDataTypesVariables;

public class Demo4 {
    public static void main(String[] args) {
        // `char` is a primitive data type (has no methods);
        char charA = 'A';
        // `Character` is a Wrapper Class (has methods)
        Character characterA = 'A';

        String name = "Kieran";
        System.out.println(name.length()); // returns string length
        System.out.println(name.charAt(0)); // returns string first letter
    }
}
