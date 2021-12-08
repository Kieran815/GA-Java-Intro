package day05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoLambda4 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // `.stream().filter()`
        List<Integer> evenNumberList = numbersList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        evenNumberList.forEach(num -> System.out.println(num));

        List<Integer> integerList = numbersList.stream().map(number -> Integer.valueOf(number)).collect(Collectors.toList());
        integerList.stream().forEach(integer -> System.out.println(integer));
    }
}
