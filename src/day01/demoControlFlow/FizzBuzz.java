package day01.demoControlFlow;

public class FizzBuzz {
    public static void main(String[] args) {
        int input = 1;

        do {
                        if(input % 3 == 0 && input % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            if(input % 3 == 0) {
                System.out.println("fizz");
            } else if (input % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(input);
            }
        } while (input < 101);

        /*
        do {
            switch(input) {
                case (input % 3 == 0 && input % 5 == 0):
                    System.out.println("fizzbuzz");
                case (input % 3 == 0):
                    System.out.println("fizz");
                case (input % 5 == 0):
                    System.out.println("buzz");
                default:
                    System.out.println(input);
            }
            input++;
        } while(input < 101);
        */
    }
}
