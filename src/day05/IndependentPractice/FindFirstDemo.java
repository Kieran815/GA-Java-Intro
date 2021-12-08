package day05.IndependentPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindFirstDemo {
    public static void main(String[] args) {
        List<Person> largePersonList =
            Arrays.asList(
                new Person("Tom", 30),
                new Person("John", 29),
                new Person("Kevin", 37),
                new Person("Mark", 35),
                new Person("Chris", 37),
                new Person("Paige", 31),
                new Person("Helen", 60),
                new Person("Erin", 50),
                new Person("Zach", 10),
                new Person("Jane", 45),
                new Person("Amy", 31));

        Person over35 = largePersonList.stream()
                .filter(person -> person.getAge() > 35)
                .findFirst() // finds first instance of `true` from `.filter`
                .orElse(null); // `orElse` called if `findFirst` returns no results

        System.out.println("People Over 35: " + over35);


        // `.toSet()`
        List<Person> newPersonList = Arrays.asList(
                new Person("Tom", 30),
                new Person("Tom", 30),
                new Person("Jenny", 20)
        );

        Set<Person> newPersonSet = newPersonList.stream()
                .collect(Collectors.toSet());
        System.out.println("New Person Set:");
        newPersonSet.forEach(System.out::println);

        System.out.println(newPersonList.get(0).hashCode());
        System.out.println(newPersonList.get(1).hashCode());
        System.out.println(newPersonList.get(2).hashCode());

        // `.toMap()`
        System.out.println("\n`toMap()`");
        Map<String, Integer> nameToAgeMap =
                largePersonList.stream()
                        .collect(Collectors.toMap(
                                person -> person.getName(),
                                person -> person.getAge(),
                                (first, second) -> second
                                ));

        nameToAgeMap.forEach((key, value) -> System.out.println("Name is " + key + " and age is " + value));
    }
}
