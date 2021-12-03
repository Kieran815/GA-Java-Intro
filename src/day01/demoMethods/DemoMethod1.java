package day01.demoMethods;

public class DemoMethod1 {
    int mySum; // global variables

//    public static void main(String[] args) {
//        getSum();
//        // System.out.println(sum); // not available
//    }

    // Won't Work, because method does not return a value;
//    public static void getSum() {
//        int sum = 2 + 2; // local scope, not available outside of method
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        int returned = returnSum();
        System.out.println("Printed from `main`: " + returned + " (passed from `returnSum()`)");
    }
    // Have Method Return a Value:
    // declare the type of data being returned
    public static int returnSum() {
        int sum = 2 + 2;
        System.out.println("Printed from `returnSum()`: " + sum + " (local variable)");
        // value of sum is returned and passed up to `returned` in `main`
        return sum;
    }
}
