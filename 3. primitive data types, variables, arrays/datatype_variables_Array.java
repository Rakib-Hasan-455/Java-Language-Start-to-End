import java.util.Arrays;

public class datatype_variables_Array {
    public static void main(String[] args) {
        //All type of data type
        dataTypes();
        numberSystem();
        //Num sys HW
        hwOfNumSys();
        //Type Cast
        typeCast();
        //Arrays
        arraysChap();
    }

    private static void arraysChap() {
        int[] arr1 = new int[10]; //better to use this cause it's more readable
        int[] arr2 = new int[10]; // all array index default values are 0

        double[] arrD = new double[10]; // all array default value 0.0
        boolean[] arrB = new boolean[10];// default values are false

        //Out of bound runtime exception while trying to access more than initialized array size or ranged index value
        // int x = arr1[10]; //error

        //1D array
        int[] arr1D = {3, 2, 6, 5, 4}; //auto size = 5
        int arrValue = arr1D[2]; // 6

        //sum of array
        int sum1 = 0;
        int arrSize = arr1D.length; // 6
        for (int i = 0; i < arr1D.length; i++) {
            sum1 = sum1 + arr1D[i];
        }
        System.out.println("Sum of array = " + sum1);

        //2D array
        int[][] arr2D = {
                {1, 2, 3, 4},
                {2, 4, 5, 7}
        }; // auto size = 4*4 dimension

        int[][] arr2D1 = new int[5][4]; //size = 5*4

        //Sorting or Printing array as string
        int[] arrSort = {3, 2, 5, 1, 8, 6};
        System.out.println("Before Sorting -> " + Arrays.toString(arrSort));
        Arrays.sort(arrSort, 0, 6);
        System.out.println("After Sorting -> " + Arrays.toString(arrSort));
        // to see Arrays class, hover on Arrays class keyword then press ctrl+left click
//         Arrays class documentation -> https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        //Arrays useful methods
        // sort
        // binary search
        // equals(arr1, arr2) -> bool value return
        // fill(arr1, 8) -> fills all arr index value with 8
        // arr1 = Arrays.copyOf(arr2, 10) -> copies arr2 of 10 size to arr1
        // ArrayList arrlist = Arrays.asList(arr1) -> returns arrays as list
        // hashcode, deep hashcode
        // String s = Arrays.toString(arr1) -> converts array to string
        // deepToString
        // setAll, Parallel SetAll
        // spliterator
        // Stream
    }

    private static void numberSystem() {
        //Number System
        int decimal = 1000;
        int binary = 0b001100; //binary -> 0bValues
        int octal = 0324; //octal literal -> 0Values
        int hexa = 0x29AE8; //hexa -> 0xValues
        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexa);
    }

    private static void hwOfNumSys() {
        int bandName = 0xABCD;
        //ABCD
        // A = 10, B = 11, C = 12, D = 13
        // Decimal = 10*16^3 + 11*16^2 + 12*16^1 + 13*16^0
        //         = 43921
        System.out.println("band name decimal -> " + bandName);
    }

    private static void typeCast() {
        //Type Cast -> Sometimes it used to convert high byte sized data type value to low byte sized data type value
        int overFlowInt = 24444;
        byte bTC = (byte) overFlowInt; //integer to byte where byte takes the value overFlowInt%128 as it overflows bytes ranges
        System.out.println(bTC);
        int modOverFlowInt = 24444 % 128;
        System.out.println(modOverFlowInt);

        double dTC = (double) 1000000000000000L;

    }

    private static void dataTypes() {
        byte b = 127;     //1 byte -> 2^(8*1=8) bit = -127 to 127 value range
        short s = 32767;  //2 byte -> 2^(8*2=16) bit = -32767 to - 32767 value range
        int i = (int) Math.pow(2, 31);      //4 byte -> 2^(8*4=32) bit = -2^32 to 2^32 value range
        long l1 = 1000000000; // without L at last -> compiler guess int range value by default
        long l2 = 1_00_000_0000_0L;        //8 byte -> 2^(8*8=64) bit = -2^64 to 2^64 value range
        //float f1 = 100.2;   //Without last F compiler guess double range by default, where can't store 16 byte double into 8 byte float
        float f2 = 100.2F;    //With F compiler realizes float value where F is a literal
        double dbl = 1000.2;
        char c1 = 'a';
        System.out.print(c1); //print a
        char c2 = 97;
        System.out.println(c2); //print a with ASCII value reference 97

        char c3 = '\313'; //Octal Notation -> /xxx
        char c4 = '\u0011';//hexa notation -> /uXXXX

        String s1 = "Hello";
        String s2 = "\"Hello, World\""; //Output -> "Hello world"


    }
}
