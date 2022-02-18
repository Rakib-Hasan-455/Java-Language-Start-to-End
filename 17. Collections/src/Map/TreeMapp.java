package Map;
// Sorted Map :D
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        // create
        hashMap.put("Rakib", 100);
        hashMap.put("Sakib", 200);
        hashMap.put("Hakib", 130);
        hashMap.put("Nakib", 104);
        hashMap.put("Qakib", 600);
        hashMap.put("Aaab", 999);

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
