package day02.demoArray;

public class DemoArray {
    public static void main(String[] args) {
        int[] anArray; // creates to pointer in storage to the array
        anArray = new int[10]; // allocate 10 memory locations for array

        anArray[0] = 100;
        anArray[1] = 200;

        System.out.println(anArray[0]); // output: 100
        System.out.println(anArray[1]); // output: 200
        System.out.println(anArray[2]); // output of unassigned values == 0;
        System.out.println(anArray.length); // # of memory blocks allocated (10);

        String[] favThings = new String[10];
        favThings[0] = "Cats";
        favThings[1] = "Dogs";
        favThings[2] = "Pizza";

        System.out.println(favThings.length);
        for (int i = 0; i < favThings.length; i++) {
            System.out.println(favThings[i]);
        }
    }
}
