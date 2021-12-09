package day06.demoOptionals;

import java.util.Optional;

public class OptionalDemo2 {

    public static void main(String[] args) {
        System.out.println("Optionals and Streams:");

        Integer age = 36; // `not sure` if a variable has been instantiated yet? USE AN OPTIONAL:
        Optional<Integer> ageOptional = Optional.ofNullable(age);
        System.out.println(ageOptional);

        System.out.println("`Optionals` are containers, so you can run streams on them:");
        Boolean canBuy = ageOptional.filter(myAge -> myAge >= 21).isPresent();
        System.out.println(canBuy); // will return `true`: the value `isPresent()` and myAge > 21

    }
}
