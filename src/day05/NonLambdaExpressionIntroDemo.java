package day05;

public class NonLambdaExpressionIntroDemo {
    // Here's the Computation interface:
    interface Computation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {

        // Notice the use of the anonymous inner class:
        Computation add = new Computation() {

            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        System.out.println("5 + 6 = " + add.operation(5, 6));

        // Notice the use of yet another anonymous inner class:
        Computation subtract = new Computation() {

            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };

        System.out.println("10 - 6 = " + subtract.operation(10, 6));

    }
}
