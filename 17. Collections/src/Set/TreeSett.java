// TreeSet is ordered set which have only common single elements

package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Ant");
        treeSet.add("Bird");
        treeSet.add("Elephant");
        treeSet.add("Owl");
//        hashSet.add("Dog");
        treeSet.add("Hello");
//        hashSet.add("Bird");

        System.out.println(treeSet);

        // Retrieve -> get() -> get doesn't work in TreeSet
//        System.out.println("Get 2nd index -> " + hashSet.get(2));

        // Update -> set()  -> Set doesn't work in TreeSet
//        hashSet.set(2, "Hii updated");
//        System.out.println("TreeSet String Updated: " + hashSet);

        // Delete -> remove() -> Remove doesn't work in TreeSet
//        treeSet.remove(1);
//        System.out.println("Hashset After delete: " + treeSet);
//
//        // Check if contains
        if (treeSet.contains("Hello")) {
            System.out.println("Hello is in the Hashset");
        }
//
//        // Printing TreeSet
//
//        // Can't print TreeSet with for loop
////        System.out.println("\nPrinting with For Loop");
////        for (int i = 0; i < hashSet.size(); i++) {
////            System.out.println(hashSet.get(i));
////        }
//
        System.out.println("\nPrinting with For Each Loop");
        for (String x : treeSet) {
            System.out.println(x);
        }

        System.out.println("\nPrinting with Iterator");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
            // Delete with iterator
            if (str.equals("Hello")) {
                iterator.remove();
            }
        }
        System.out.println("After Iterator Delete -> " + treeSet);
    }
}
