//Not coded by me as i felt unnecessary

public class MathClass {

    public static void main(String[] args) {
        System.out.println(Math.PI);		// 3.141592653589793
        System.out.println(Math.max(3, 5)); // 5
        System.out.println(Math.min(3, 5));	// 3
        System.out.println(Math.sqrt(4));	// 2.0
        int absoluteValue = Math.abs(-5);
        System.out.println(absoluteValue);	// 5

        // NaN = Not a Number = Invalid result
        System.out.println(Math.sqrt(-1));	// NaN
        System.out.println(0 / 0.0);		// NaN
        System.out.println((0 / 0.0) + 5);	// NaN

        System.out.println(5 / 0.0);		// Infinity
        System.out.println(-5 / 0.0);		// -Infinity

        System.out.println(Math.round(20.0 / 3.0));						// 7
        System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67

        //Ceil set the value to closest upper value
        System.out.println(Math.ceil(20.4)); // 21
        System.out.println(Math.ceil(20.7)); // 21

        //floor set the value to closest lower value
        System.out.println(Math.floor(20.4)); // 20
        System.out.println(Math.floor(20.7)); // 20

        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200

    }

}