package day01.demoControlFlow;

public class DemoControlFlow1 {
    public static void main(String[] args) {
        // IF Example
        boolean beautiful = true;
        String name = "Avantika";
        if(beautiful) {
            System.out.println("Hi, " + name + "!!!");
            name = "Michelle";
        }
        // won't print, out of local scope
        System.out.println(name);

        // IF/ELSEIF/ELSE Example
        name = "Kieran";
        if (name.equals("Kieran")) {
            System.out.println(("Welcome " + name));
        } else if (name.equals("Abel")) {
            System.out.println("Welcome " + name);
        } else {
            System.out.println("Welcome, User");
        }

        // Ternerary
        int age = 36;
        String allowed;
        if (age > 21) {
            allowed = "yes";
            System.out.println((allowed));
        } else {
            allowed = "no";
            System.out.println((allowed));
        }

        allowed = (age > 21) ? "yes" : "no";
        System.out.println(allowed);

        // `&&` AND Operator
        String firstName = "Kieran";
        String lastName = "Milligan";
        if(firstName.equals("Kieran") && lastName.equals("Milligan")) {
            System.out.println(true);
        }

        // `||` OR Operator
        if(firstName.equals("Kieran") || lastName.equals("Milligan")) {
            System.out.println(firstName + " " + lastName);
        }

        // `==` vs `.equals` (strings)
        String blue = "blue";
        String bl = "bl";
        String ue = "ue";
        System.out.println(bl + ue);
        boolean withSigns = (bl + ue == blue);
        System.out.println(withSigns);
        boolean withWords = ((bl + ue).equals(blue));
        System.out.println(withWords);

        // switch statements
        // casing matters in Java
        String name2 = "abby";

        switch (name2) {
            case "Kieran":
                System.out.println("Kieran");
                break;
            case "Abby":
                System.out.println("Abby");
                break;
            default:
                System.out.println("none");
        }

        // loops
        /*
        while (true) {
          // an infinite loop!
        }
        */

        // DO/WHILE
        System.out.println("DO/WHILE Loop");
        int input = 0; // initialization variable
        do {
            input++; // incrementation
            System.out.println(input);
        } while (input < 10); // condition

        System.out.println("FOR Loop");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        };


    }
}
