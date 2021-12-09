package day06.demoOptionals;

import java.util.Optional;

public class OptionalsDemo1 {
    public static void main(String[] args) {
        System.out.println("Name: ");
        String name = "Kieran";
        System.out.println(name.length()); // Returns `6`

        String name1 = null;
//        System.out.println(name1.length()); // will return a `NullPointerException` because the string is `null`

        // use `Optional` to empty potentially empty values:
//        Optional<String> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional.isPresent());

        // back to `name1`:
        Optional<String> stringOptional = Optional.of(name);
        System.out.println(stringOptional.isPresent()); // will return `true` since `name` = `"Kieran"`
        System.out.println("\n");

        System.out.println("Name 1: " + name1);
        Optional<String> stringOptinal1 = Optional.ofNullable(name1); // `.ofNullable` check if an object value IS there (`true) or is EMPTY (`false`)
        System.out.println(stringOptinal1.isPresent()); // will return `false` since `name1` = `null`, so it is NOT present

        // example
        Integer age = 36;
        System.out.println("Age: " + age);
        Optional<Integer> optionalInteger = Optional.ofNullable(age);
        System.out.println(optionalInteger.isPresent()); // will return `true` because `age` is there and haa a value
        System.out.println("\n");

        Integer age2 = 11;
        System.out.println("Age 2: " + age2);
        Optional<Integer> optionalInteger1 = Optional.ofNullable(age2); // there is a value and the value is `11`
        System.out.println("I am " + optionalInteger1.isPresent()); // will return
        optionalInteger1.ifPresent(theAge -> System.out.println("My Age Is " + theAge)); // `ifPresent` checks to see if there is a value attached
        System.out.println("\n");

        System.out.println(".orElse():");
        Optional<String> nameOptional = Optional.ofNullable(null);
//        System.out.println(nameOptional.get()); // if value is set to `null`, this will throw an error, because there is not value to `get()`
        // use `orElse` to catch errors if no value exists:
        System.out.println(nameOptional.orElse("Empty String"));

        // you can also pass methods or lambda functions to `orElse()`:
        Optional<String> nameOptional1 = Optional.ofNullable(null);
        System.out.println(nameOptional1.orElse(getDefaultName())); // see `getDefaultName()` below `main`


    }

    public static String getDefaultName() {
        return "World";
    }
}
