import java.util.Arrays;
import java.util.Scanner;

public class StringFormattingDemo {

    public static void main(String[] args) {
        System.out.println("===== String methods =====");
        System.out.println();

        String s = " hello ";
        System.out.println("s.length(): " + s.length());					// 7
        System.out.println("s.contains(\"he\"): " + s.contains("he"));		// true
        System.out.println("s.isEmpty: " + s.isEmpty());					// false
        System.out.println("s.toUpperCase(): " + s.toUpperCase());			//  HELLO
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));	// false
        System.out.println("s.endsWith(\" \"): "+ s.endsWith(" "));			// true
        System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL"));	// heLLo
        System.out.println("s.trim(): " + s.trim());						// hello
//        System.out.println("s.strip(): " + s.strip());						// hello
        // Trim and Strip removes all the spaces
        System.out.println("s.substring(0, 3): " + s.substring(0, 3));		//  he
        System.out.println("Arrays.toString(s.getBytes()): "
                + Arrays.toString(s.getBytes()));	// [32, 104, 101, 108, 108, 111, 32]
        System.out.println("Arrays.toString(s.toCharArray()): "
                + Arrays.toString(s.toCharArray()));	// [ , h, e, l, l, o,  ]
        System.out.println("s.charAt(1): " + s.charAt(1));					// h
        System.out.println("Arrays.toString(s.split(\"e\")): "
                + Arrays.toString(s.split("e")));					// [ h, llo ]
        String s1 = s.join(" ", s.split("e"));
        System.out.println("Power of Join: "+ s1);
        // s is same as before. No matter how much we called function it didn't changed .
        // so strings in java are immutable.
        System.out.println(s);												// hello
    }

}