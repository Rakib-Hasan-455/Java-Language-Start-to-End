package Optional;

import java.util.Locale;
import java.util.Optional;

// Used so that no null pointer exception happen
public class _Optional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        // Check if it has value (true if has and false if empty)
        System.out.println(optional.isPresent());

        Optional<String> optional1 = Optional.of("world1");
        System.out.println(optional1.isPresent());

        System.out.println(optional1);

        optional1.ifPresent((abc) -> {
            System.out.println("It's Present");
        });

        // if optional empty/null then return world
        String ifPresentFalseReturn = optional.orElse("world");
        System.out.println(" -> " + ifPresentFalseReturn);

        // if optional empty/null then return world and if true uppercase optional1
        String ifPresentFalseReturn1 = optional1
                .map(String::toUpperCase)
                .orElse("world");
        System.out.println(" -> " + ifPresentFalseReturn1);

        // with lamda orElseGet
        // if optional empty/null then return world and if true uppercase optional1
        String ifPresentFalseReturn2 = optional1
                .map(String::toUpperCase)
                .orElseGet(() -> "empty maybe");
        System.out.println(" -> " + ifPresentFalseReturn2);

        // OrElseThrow exception
        String ifPresentFalseReturn3 = optional1
                .map(String::toUpperCase)
                .orElseThrow(IllegalAccessError::new);
        System.out.println(" -> " + ifPresentFalseReturn3);


        // Null Pointer Exception handle with Optional
        Person person = new Person("James", "Rakibul hasan@gmail.com");

        // Null Pointer Exception during .lowerCase() function use
//        System.out.println(person.getEmail().toLowerCase());

        // Optional handled exception
        System.out.println(person.getEmail1()
                .map(String::toLowerCase)
                .orElse("Email not provided"));

        // Alternative traditional of above code
        if(person.getEmail1().isPresent()) {
            String email = person.getEmail1().get();
            System.out.println(email.toLowerCase(Locale.ROOT));
        } else {
            System.out.println("Email noott Provided");
        }
    }

    static class Person {
        private final String name, email;

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public Optional<String> getEmail1() {
            return Optional.ofNullable(email);
        }

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }
}
