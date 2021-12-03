package day01.demoDataTypesVariables;

public class Demo2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        // basic math works the same...
        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 / 2);
        System.out.println(2 * 2);
        System.out.println(2 % 2);

        // both of these will return `2`, which is incorrect
        // the args are passed as `int` values, which do not allow decimals
        System.out.println(5 / 2);

        // below returns error message:
        // `'5/2': integer division in floating-point context`
        float value = 5/2; // returns `2`
        System.out.println(value);
        // add `f` to end of `int` values to convert them to `float`
        float value2 = 5f / 2f; // returns `2.5`
        System.out.println(value2);
        // returns `2` because variables were initialized as `int`, not `float`
        System.out.println(x / y);

    }
}
