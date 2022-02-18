package Stack;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Stackk {
    public static void main(String[] args) {
        Stack list1 = new Stack();

        // Create -> add()
        list1.add(1.2);
        list1.add(100);
        list1.push("abc");
        list1.push(11);

        System.out.println("Stack of any type: " + list1);
        System.out.println("Stack Top: " + list1.peek());
        list1.pop();
        System.out.println("Stack After Pop: " + list1);

        // Retrieve object list1
        Object obj = list1.get(2);
        System.out.println("2nd index any type object -> " + obj);

        Stack<String> list2 = new Stack<String>();

        list2.add("Hello");
        list2.add("Hi");
        list2.add("Bye");

        System.out.println("Stack String: " + list2);

        // Retrieve -> get()
        System.out.println("Get 2nd index -> " + list2.get(2));

        // Update -> set()
        list2.set(2, "Hii updated");
        System.out.println("Stack String Updated: " + list2);
        // Delete -> remove()
        list2.remove(1);
        System.out.println("Stack After delete: " + list2);

        // Check if contains
        if (list2.contains("Hello")) {
            System.out.println("Hello is in the Stack");
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
            if (str.equals("11")) {
                iterator.remove();
            }
        }
        System.out.println("Stack After Iterator Delete -> " + list1);
    }
}
