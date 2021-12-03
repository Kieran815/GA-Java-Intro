package day01.demoMethods;

public class DemoMethod2 {

    // params are args passed into a method when it's called
    public static int returnSum(int paramX, int paramY) {
        return paramX + paramY;
    }

    public static void main(String[] args) {
     int argumentX = 10;
     int argumentY = 20;
     // arguments are the actual values that are passed to the method
     int sum = returnSum(argumentX, argumentY);
    }
}
