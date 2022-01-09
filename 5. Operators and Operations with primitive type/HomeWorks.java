import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
    areaOfTriangle();
    circleArea();
    }

    private static void circleArea() {
        System.out.println("Circle Radius R = ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI*2*r;
        System.out.println(area);
    }

    private static void areaOfTriangle() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2.0;
        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(result);
    }
}
