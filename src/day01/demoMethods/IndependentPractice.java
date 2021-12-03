package day01.demoMethods;

public class IndependentPractice {
    public static void main(String[] args) {
        int divBy7 = divide152By(7);
        System.out.println(divBy7);

        double trans1 = transmogrifier(5, 4, 3);
        double trans2 = transmogrifier(13, 12, 5);
        double trans3 = transmogrifier(42, 13, 7);
        System.out.println(trans1);
        System.out.println(trans2);
        System.out.println(trans3);
    }

    public static int divide152By(int num) {
        return 152 / num;
    }

    public static double transmogrifier(int a, int b, int c) {
        return Math.pow((a * b), c);
    }
}
