import java.util.Scanner;

public class Factorial_Mathmatical {
    public void Operation() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nFact = factorial(n);
        int kFact = factorial(k);
        int n_kFact = 0;
        if((n-k) >= 0){
            n_kFact = factorial(n-k);
        }
        double result = (double) nFact / (kFact* n_kFact);
        System.out.println(result);

    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }
}
