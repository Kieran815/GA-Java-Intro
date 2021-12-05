package day02.demoLinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class demoHashMap {
    public static void main(String[] args) {
        // HashMap<Key, Value> name
        HashMap<String, String> student = new HashMap<>();
        // HashMap prevents duplicate values
        student.put("111", "Kieran");
        student.put("112", "Suresh");
        student.put("113", "Brandon");
        System.out.println(student);

        // assigning a value to an existing location overwrites the value
        student.put("113", "Test");
        System.out.println(student);

        // `.remove()` receives the key
        student.remove("112");
        System.out.println(student);

        /*
        Create a LinkedList of strings with the values {"One","Two","Three","Four"}.
        Create a HashMap with the keys {"One","Two","Three","Four"} taken from the
        list and the integer values {1,2,3,4} taken from the array.
        Print out the HashMap size after adding the above items to it.
        */

//        LinkedList<String> numStr = new LinkedList<String>();

        LinkedList<String> numStr = new LinkedList<>();
        numStr.add("One");
        numStr.add("Two");
        numStr.add("Three");
        numStr.add("Four");

        HashMap<String, Integer> merge = new HashMap<>();
        // HashMap prevents duplicate values
        for (int i = 0; i < numStr.size(); i++) {
            merge.put(numStr.get(i), i);
        }
        System.out.println(merge);




    }
}
