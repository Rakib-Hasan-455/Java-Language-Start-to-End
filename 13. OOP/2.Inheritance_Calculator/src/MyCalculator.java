//Class memeber is all the methods and objects in a class
//here after inheritance all members of calculator added in mycalculator
//You can't inherit multiple class in Java.

import java.util.Scanner;
//here MyCalculator = child Class / Base Class
//here Calculator   = parent class/ Super Class
public class MyCalculator extends Calculator{
    public static void main(String[] args) {
        double a, b, result;
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("Addition: "+cal.doAdd(a, b));
        System.out.println("Subtraction: "+cal.doSub(a, b));
        System.out.println("Multiply: "+cal.doMultiply(a, b));
        System.out.println("Division: "+cal.doDiv(a, b));
    }
}
