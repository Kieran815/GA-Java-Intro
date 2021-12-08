package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterationWithConcatenationDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("My Name is ", "My friends call me ", "My Mom calls me ");
        List<String> concatenatedList = new ArrayList<>();
        stringList.stream().forEach(stringValue -> concatenatedList.add(stringValue + "Kieran"));
        System.out.println(stringList);
        System.out.println(concatenatedList);
        concatenatedList.forEach(System.out::println);
    }
}
