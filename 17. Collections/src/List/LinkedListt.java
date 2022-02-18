package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
    public static void main(String[] args) {
        List list1 = new LinkedList();

        // Create -> add()
        list1.add("abc");
        list1.add(011);
        list1.add(1.2);
        list1.add(11);
        System.out.println("Linked list of any type: " + list1);
        // Retrieve object list1
        Object obj = list1.get(2);
        System.out.println("2nd index any type object -> " + obj);

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Hello");
        list2.add("Hi");
        list2.add("Bye");

        System.out.println("Linked list String: " + list2);

        // Retrieve -> get()
        System.out.println("Get 2nd index -> " + list2.get(2));

        // Update -> set()
        list2.set(2, "Hii updated");
        System.out.println("Linked list String Updated: " + list2);
        // Delete -> remove()
        list2.remove(1);
        System.out.println("Linked list After delete: " + list2);

        // Check if contains
        if (list2.contains("Hello")) {
            System.out.println("Hello is in the Linked list");
        }

        // Printing ArrayList
        System.out.println("\nPrinting with For Loop");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("\nPrinting with For Each Loop");
        for (Object x : list1) {
            System.out.println(x);
        }

        System.out.println("\nPrinting with Iterator");
        Iterator<Object> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next().toString();
            System.out.println(str);
            // Delete with iterator
            if (str.equals("9")) {
                iterator.remove();
            }
        }
        System.out.println("After Iterator Delete -> " + list1);
    }
}
