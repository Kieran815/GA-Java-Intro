package day06.demoOptionals;

import java.util.Optional;

public class OptionalsDemo3 {

    public static void main(String[] args) {
        Person guy = new Person(36);

        boolean canAlsoBuy = Optional.ofNullable(guy)
                .map(Person::getAge)
                .filter(age -> age >= 21)
                .isPresent();

        System.out.println(canAlsoBuy); // returns true, value is there and age > 21;
    }
}
