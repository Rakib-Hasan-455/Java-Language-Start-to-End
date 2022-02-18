// Hashset is unordered set which have only common single elements

package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Ant");
        hashSet.add("Bird");
        hashSet.add("Elephant");
        hashSet.add("Owl");
        hashSet.add("Dog");
        hashSet.add("Hello");
        hashSet.add("Bird");

        System.out.println(hashSet);

        // Retrieve -> get() -> get doesn't work in hashset
//        System.out.println("Get 2nd index -> " + hashSet.get(2));

        // Update -> set() -> set doesn't work in hashset
//        hashSet.set(2, "Hii updated");
//        System.out.println("Hashset String Updated: " + hashSet);

        // Delete -> remove() -> Remove doesn't work in hashset
//        hashSet.remove(1);
//        System.out.println("Hashset After delete: " + hashSet);

        // Check if contains
        if (hashSet.contains("Hello")) {
            System.out.println("Hello is in the Hashset");
        }

        // Printing ArrayList

        // Can't print hashset with for loop
//        System.out.println("\nPrinting with For Loop");
//        for (int i = 0; i < hashSet.size(); i++) {
//            System.out.println(hashSet.get(i));
//        }

        System.out.println("\nPrinting with For Each Loop");
        for (Object x : hashSet) {
            System.out.println(x);
        }

        System.out.println("\nPrinting with Iterator");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next().toString();
            System.out.println(str);
            // Delete with iterator
            if (str.equals("Hello")) {
                iterator.remove();
            }
        }
        System.out.println("After Iterator Delete -> " + hashSet);
    }
}
