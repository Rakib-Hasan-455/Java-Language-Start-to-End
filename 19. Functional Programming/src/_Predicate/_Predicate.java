package _Predicate;

import java.util.function.Predicate;
// Predicate returns true or false
public class _Predicate {
    public static void main(String[] args) {
        // Without Predicate
        System.out.println(validPhoneCheck("0188888999"));
        System.out.println(validPhoneCheck("188888999"));
        System.out.println(validPhoneCheck("01888889991"));

        // With predicate
        System.out.println("With predicate");
        System.out.println(phonePredicate.test("0188888999"));
        System.out.println(phonePredicate.test("012121212"));
    }

    private static boolean validPhoneCheck(String phoneNumber) {
        return phoneNumber.startsWith("01") && phoneNumber.length() == 10;
    }

    static Predicate<String> phonePredicate = phoneNumber ->
            phoneNumber.startsWith("01") && phoneNumber.length() == 10;
}
