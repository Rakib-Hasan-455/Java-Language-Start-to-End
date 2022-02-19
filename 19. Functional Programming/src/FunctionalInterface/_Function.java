package FunctionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument -> abc(2);

        // Simple Function
        int number1 = incrementOne(10);
        System.out.println(number1);

        // Functional Interface
        int number2 = incrementByOne.apply(12);
        System.out.println(number2);

        int number3 = multiplyByTen.apply(2);
        System.out.println(number3);

        int inc1AndMult10 = increm1AndMultiply10.apply(2);
        System.out.println(inc1AndMult10);

    }

    static int incrementOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static Function<Integer, Integer> increm1AndMultiply10 =
            incrementByOne.andThen(multiplyByTen);
}
