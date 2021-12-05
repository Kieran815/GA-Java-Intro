package day02.demoArray;

import java.util.ArrayList;

public class DemoArrayList {

    // pass `ArrayList` to method
    public static void printMyList(ArrayList<String> myStringArrayList) {
        // `ArrayList` uses `size()` insead of `length` (normal arrays)
        for (int i = 0; i < myStringArrayList.size(); i ++)
        System.out.println("Where i = " + i + ": " + myStringArrayList.get(i));
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");  //
        arrayList.add("C++");
        arrayList.add("Python");
        arrayList.add("C");
        // if an object contains a list of values, it is called a `container`;
//        System.out.println(arrayList);
        arrayList.add(0, "ASM"); // adds to front of array
//        System.out.println(arrayList);
        arrayList.set(1, "Java 11");
//        System.out.println(arrayList);
        // arrayList[0] = "Hi"; // won't work, must use `arrayList.set[0]
        printMyList(arrayList);

        // ENHANCED `for` LOOP
        // *** FASTER THAN NORMAL `for` LIST:
        for(String temp : arrayList) {
            System.out.println("I Love " + temp);
        }
    }
}
