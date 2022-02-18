package Map;

import java.util.HashMap;
import java.util.Hashtable;

// Hashmap and hashtables are same
// hashtables synchronized and slow and thread secured
// Hash tables dont allow null key
// Hashmap allows one null key
public class HashTablee {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashMap = new Hashtable<>();
        // create
        hashMap.put("Rakib", 100);
        hashMap.put("Sakib", 200);
        hashMap.put("Hakib", 130);
        hashMap.put("Nakib", 104);
        hashMap.put("Qakib", 600);

        // Retrive
        System.out.println("Value of quakib = " + hashMap.get("Qakib"));
        System.out.println(hashMap);

        // update
        hashMap.put("Rakib", 700);

        // Delete
        hashMap.remove("Hakib");

        System.out.println("After delete: " + hashMap);
    }
}
