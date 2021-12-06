package day02round2;


import java.util.*;

public class LinkedListsAndMaps {
    public static void main(String[] args) {
        // **** LinkedLists ****
            // `LinkedList` are collections of objects linked by pointers to each memory location
            // data is inserted and removed like a chain
                // LinkedList is better than ArrayList for constantly changing lists
                // ArrayList is better than LinkedList for quick data retrieval

        // Review of writing ArrayList
        ArrayList<String> iceCreamFlavors = new ArrayList<>();
        iceCreamFlavors.add("Chocolate");
        iceCreamFlavors.add("Vanilla");
        iceCreamFlavors.add("Strawberry");
        System.out.println("Ice Cream Flavors: " + iceCreamFlavors);

        // ** Fun fact: You can actually convert between arrays and lists easily:
        String[] favGames = {"Metroid", "Zelda", "Mario Kart"};
        List<String> stringArrayList = Arrays.asList(favGames);
        System.out.println("Fav Games as a List" + stringArrayList);

        LinkedList<String> bestCities = new LinkedList<>();
        bestCities.add("Cleveland");
        bestCities.add("Chicago");
        bestCities.add("New York");
        bestCities.add("Los Angeles");

        // independent practice:
        /*
        Create a LinkedList containing the numbers 1–10.
        Then, test to see if the values 5–15 exist in the list and remove the elements that exist (i.e., remove 5–10).
        Finally, print the size of the list.
        */
        LinkedList<Integer> countUp = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            countUp.add(i);
        }
        System.out.println("countUp collection size: " + countUp.size());

        // **** MAPS ****
            // A Map is similar to a List, but keeps Key/Value Pairs
                // Each Key is unique and maps to a value, but there can be duplicate values

            // *** HashMap ***
                // data is stored in an array
                // index where data is stored is generated by a `hash` function
                    // give `HashMap` an object to use as a `key`, and it returns the `integer` to use as the `index`
                    // when you retrieve the `value`, it uses the same function to generate the same `index`
                    // `String`s are often used as keys
                // Collisions
                    // if a collision occurs, the data object is added to the end of the list

                // NOTE: you have no control over the sort or order of the elements in a map

        HashMap<String, String> student = new HashMap<>();

        student.put("abc123", "Kieran");
        student.put("def456", "Mike");
        student.put("ghi789", "Avantika");
        System.out.println(student);


        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "A fruit from a tree");
        dictionary.put("lake", "A large body of water");
        System.out.println(dictionary);


        LinkedList<String> someValues = new LinkedList<>();
        someValues.add("One");
        someValues.add("Two");
        someValues.add("Three");
        someValues.add("Four");

        HashMap<Integer, String> combined = new HashMap<>();

        for(int i = 0; i < someValues.size(); i++) {
            combined.put(i, someValues.get(i));
        }

        System.out.println(combined);



    }
}
