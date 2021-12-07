package day04.demoSubclasses;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        System.out.println(lion.getLives());
        System.out.println(lion.hasWhiskers());
        System.out.println(lion.favoriteSnack());
        System.out.println(lion);
        System.out.println(lion.sayHello());

        // Create an instance of a Child class that calls the Parent class:
        // this is casting data types
        Cat cat = new Lion();
        System.out.println(cat.favoriteSnack());
        System.out.println(cat.getLives());
    }
}
