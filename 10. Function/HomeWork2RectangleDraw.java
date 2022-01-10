import java.util.Scanner;

public class HomeWork2RectangleDraw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        drawRectangle(height, width);
    }
    public static void drawRectangle(int height, int width) {
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 || i == (height - 1) || j == 0 || j == (width - 1)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
