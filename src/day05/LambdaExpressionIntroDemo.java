package day05;

public class LambdaExpressionIntroDemo {

    interface Computation {
        int operation(int a, int b);
    }

    interface HelloYou {
        void greeting(String name);
    }

    public static void main(String[] args) {

        Computation add = (a,b) -> a + b;
        System.out.println(add.operation(5,6));

        Computation subtract = (a, b) -> a - b;
        System.out.println(subtract.operation(10,6));

        HelloYou whatsGood = name ->System.out.println("Hello, " + name);
        whatsGood.greeting("Kieran");
    }
}
