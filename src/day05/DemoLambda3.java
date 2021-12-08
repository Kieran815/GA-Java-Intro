package day05;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoLambda3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("What's Good", "Homie!!!");

        // *** 3 Ways to print strings w/ `Stream`

        // create a stream to process the `stringList` items
        Stream stream = stringList.stream();
        // print all elements in stream array
        stream.forEach(stringValue -> {
            System.out.println(stringValue);
        });

        // assign and run stream on one line
        stringList.stream().forEach(x -> System.out.println(x));

        stringList.forEach(System.out::println);
    }
}
