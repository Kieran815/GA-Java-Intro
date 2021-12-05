package day02.demoExceptions;

public class DemoThrowsKeyword {
    // `throws` tell to look for errors directly
    public static void testMethod(int[] arr, int x, int y, int z) throws ArithmeticException, IndexOutOfBoundsException {
            arr[z] = x / y;
    }

    public static void main(String[] args){
        testMethod(new int[] {1, 2}, 20, 10, 1);
    }
}
