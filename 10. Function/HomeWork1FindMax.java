import java.util.Scanner;

public class HomeWork1FindMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Input Numbers: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Number = " + findMaxIntInArray(arr));
    }

    public static int findMaxIntInArray(int[] intArray) {
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(max < intArray[i]){
                max = intArray[i];
            }
        }
        return max;
    }
}
