package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Practicee {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList (
                new Person("John", 10 ,Gender.MALE),
                new Person("Johana", 12, Gender.FEMALE),
                new Person("Nona", 13, Gender.FEMALE)
        );

//         Imperative approach ❌
        System.out.println("Imperative approach: ");
//    /*
    List<Person> females = new ArrayList<>();
    for (Person person : people) {
      if (person.getGender().equals(Gender.FEMALE)) {
        females.add(person);
      }
    }
    females.forEach(System.out::println);
//    */


        // Declarative approach ✅
        System.out.println("Declarative approach:");
        // Filter

        // Filter and Print directly
        System.out.println(" / Filter and Print directly:");
        people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                       .forEach(System.out::println);

        System.out.println(" / Filter and Print Indirectly:");
        List<Person> females2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);

        // Sort
        System.out.println("Sorted List of object: ");

        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        // Comparing -> Compares by one, Then comparing -> Compares by comparing and then comparing,
        // reversed -> Sort by descending order
        sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);
        System.out.println(allMatch);
        // All values should match then it will return true

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);
        // returns true if any of the value fills condition
//    System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        // Returns true if antonio is not present
//    System.out.println(noneMatch);

        people.stream()
                .max(Comparator.comparing(Person::getAge));
        // Returns the max aged person
//        .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);;
        // returns the min aged person

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//    groupByGender.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

        // Returns data by group by gender(most common named age/gender/name)

        // Optional doesn't return null pointer exception
        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        // Returns with two condion check like female and max age
        oldestFemaleAge.ifPresent(System.out::println);
    }
}

    class Person {
        private final String name;
        private final int age;
        private final Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }