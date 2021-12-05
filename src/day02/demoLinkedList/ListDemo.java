package day02.demoLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//      ArrayList<String> arrayList = new ArrayList<>();
//      List<String> stringList = new ArrayList<>();

//        LinkedList<String> stringLinkedList = new LinkedList<>();
//        stringLinkedList.add("Cats");
//        stringLinkedList.add("Dogs");
//
//        System.out.println(stringLinkedList);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//            System.out.println(numLinkedList.contains(i));
//            if(numLinkedList.contains(i)) {
//                numLinkedList.remove(i);
//                i--;
//            }
//        }
//        System.out.println(numLinkedList);

        LinkedList<Integer> numLinkedList = new LinkedList<>();
        Integer[] nums = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(integerLinkedList);

        Integer[] numbersToCheck = new Integer[]{5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(integerLinkedList.containsAll(Arrays.asList(numbersToCheck)));
        System.out.println(integerLinkedList.removeAll(Arrays.asList(numbersToCheck)));
        System.out.println(integerLinkedList);

    }
}
