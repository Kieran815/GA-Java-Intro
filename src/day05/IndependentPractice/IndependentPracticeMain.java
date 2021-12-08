package day05.IndependentPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndependentPracticeMain {

    public static void main(String[] args) {

        List<Person> personList = createPersonList();

        // TODO: Create a list of Person objects whose names start with the letter "M".
            List<Person> startsWithM = personList.stream().filter(person -> person.getName().startsWith("M")).collect(Collectors.toList());
            startsWithM.forEach(person -> System.out.println(person));

        // TODO: Create a list of Strings containing the names of persons over the age of 40.
        List<Person> over40 = personList.stream().filter(person -> person.getAge() > 40).collect(Collectors.toList());
        over40.forEach(person -> System.out.println(person.getName()));

        // TODO: Create a list of Person objects whose names start with the letter "J" and are under the age of 47.
        List<Person> jAnd47 = personList.stream().filter(person -> person.getAge() < 47 && person.getName().startsWith("J")).collect(Collectors.toList());
        jAnd47.forEach(person -> System.out.println(person));
    }

    private static List<Person> createPersonList() {

        return Arrays.asList(
            new Person("Mark", 45),
            new Person("Henry", 30),
            new Person("John", 18),
            new Person("Morgan", 6),
            new Person("Amanda", 23),
            new Person("Tiffany", 60),
            new Person("Jim", 50),
            new Person("Janet", 45)
        );
    }
}

