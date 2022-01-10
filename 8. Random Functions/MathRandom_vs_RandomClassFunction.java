import java.util.Random;

public class MathRandom_vs_RandomClassFunction {
	
	public static void main(String[] args) {


        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200



		Random r = new Random();
		System.out.println(r.nextInt());		// any random int range
		System.out.println(r.nextInt(100)); 	// any int from 0 to 99
		System.out.println(r.nextInt(100) + 1);	// any int from 1 to 100
		
	}

}
