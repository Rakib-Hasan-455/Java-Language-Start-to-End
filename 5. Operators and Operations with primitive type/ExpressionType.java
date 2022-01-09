// This code was not coaded by me as I felt unnecessary

public class ExpressionType {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        //The value with higher sized data type always gets priority first.
        // if integer+byte= byte will be also considered as integer and it will be integer+integer
        // and it should be stored into integer or higher sized data type variable
        int intExpressionType = b + i;
        int intExpressionType2 = s + s;
        int intExpressionType3 = b + i + c;

        long longExpressionType = i + l;

        float floatExpressionType = l + f;

        double doubleExpressionType = f + d;

        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        System.out.println("Hello " + 1); // Hello 1
        System.out.println("Hello " + null); // Hello null

    }

}