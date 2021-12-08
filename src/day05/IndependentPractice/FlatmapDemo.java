package day05.IndependentPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {
    public static void main(String[] args) {
        List<Person> personList1 = Arrays.asList(
                new Person("Tom", 30),
                new Person("Jeff", 70)
        );

        List<Person> personList2 = Arrays.asList(
            new Person("Jane", 45),
            new Person("Alice", 38)
        );

        List<List<Person>> listOfPeople = Arrays.asList(personList1, personList2);
        System.out.println(listOfPeople);


        List<Person> flatePersonList =
            // convert list to stream
            listOfPeople.stream().flatMap(Collection::stream)
            .collect(Collectors.toList());

        flatePersonList.forEach(System.out::println);
    }
}
