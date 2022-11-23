package javacode;
import java.util.List;

public class DummyClass {
    public static String trueOrFalsePrimitive(boolean flag) {
        return flag ? "Yes" : "No";
    }

    public static String trueOrFalseWrap(Boolean flag) {
        return flag ? "Yes" : "No";
    }

    public static void printNumbers(int[] numbers) {
        for (int number : numbers)
            System.out.println(number);
    }

    public static void printIntegers(List<Integer> numbers) {
        for (int number : numbers)
            System.out.println(number);
    }
}
