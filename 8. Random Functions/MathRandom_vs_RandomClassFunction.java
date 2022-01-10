import java.util.Random;
import java.util.Scanner;

public class MathRandom_vs_RandomClassFunction {
// Both are same.. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Choice -> 1 = Math.Random \n \t 2 = Random Class Function\n = ");
            int choice = sc.nextInt();
            if(choice == 1){
                math_Random();
            } else {
                random_Class_Function();
            }
        }
    }

    private static void random_Class_Function() {
        Random r = new Random();
        System.out.println(r.nextInt());		// any random int range
        System.out.println(r.nextInt(100)); 	// any int from 0 to 99
        System.out.println(r.nextInt(100) + 1);	// any int from 1 to 100

    }

    private static void math_Random() {

        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200

    }

}
