package FunctionalInterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
       // Bi Function = 2 argument function
        int num1 = incrementByOneAndMultiply(2, 3);
        System.out.println(num1);

        int num2 = incrementByOneAndMultiplyBiFunction.apply(2, 4);
        System.out.println(num2);
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy10) {
        return (number + 1) * (numToMultiplyBy10 * 10);
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy10)
                    -> (numberToIncrementByOne + 1) * (numberToMultiplyBy10 * 10);


}
