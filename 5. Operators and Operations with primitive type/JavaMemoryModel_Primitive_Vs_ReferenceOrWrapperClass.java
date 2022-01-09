import java.util.ArrayList;
import java.util.Arrays;

public class JavaMemoryModel_Primitive_Vs_ReferenceOrWrapperClass {
    public static void main(String[] args) {
        // Memory -> Code, Stack, Heap
        // All Primitive Data Stays in Stack Memory
        // == sign compares Primitive variables Data
        int pValue1 = 10;
        int pValue2 = 10;
        int pValue3 = 12;
        System.out.println(pValue1 == pValue2); // True
        System.out.println(pValue1 == pValue3); // False

        // All Wrapper/Reference class creates a reference object in heap memory
        // == sign compares wrapper objects reference address
        // obj1.equals(obj2) compares wrapper objects stored value

        Integer rValue1 = 1000;
        Integer rValue2 = 1000;
        System.out.println(rValue1 == rValue2); // false -> cause two object has two different ref address
        System.out.println(rValue1.equals(rValue2)); // true as 1000 is equal 100

        // In heap to optimize memory there is a Integer pool which ranges from -127 to 127
        // where all objects with value -127 to 127 have same ref address
        // such as,
        Integer rValue3 = 127;
        Integer rValue4 = 127;
        System.out.println(rValue3 == rValue4); // true as ref address same
        System.out.println(rValue3.equals(rValue4)); // true as 127 is equal 127

        // new Integer(value) -> creates objects with different memory address which is bad for memory optimization
        Integer rValue5 = new Integer(127);
        Integer rValue6 = new Integer(127);
        System.out.println(rValue5 == rValue6); // false though it's within integer pool value range.
                                                // That's why It's bad for memory optimization if we use new Integer Constructor

        // Integer.valueOf(value) -> Stores value dynamically in a way that it can optimize memory which is better to use
        Integer rValue7 = Integer.valueOf(127);
        Integer rValue8 = Integer.valueOf(127);
        System.out.println(rValue7 == rValue8); // True as it will use heap memory integer pool range -127 to 127
        System.out.println(rValue7.equals(rValue8)); // true

        // Shallow Comparison -> arr1.equals(arr2)
        // Shallow comparison checks ref address and data both should be same
        Integer[] arr1 = {1, 2};
        Integer[] arr2 = {1, 2};
        System.out.println(arr1 == arr2); // False cause compares memory address
        System.out.println(arr1.equals(arr2)); // False cause compares memory address
        // To avoid shallow comparison
        System.out.println(Arrays.equals(arr1, arr2)); // True

// Extra
        int[] arr3 = {1, 2, 3};
        int[] arr4 = arr3;
        System.out.print("Extra:");
        System.out.println(arr3 == arr4); // True cause compares memory address
        System.out.println(arr3.equals(arr4)); // True cause compares memory address
        arr4[2] = 4;
        // arr3 = { 1, 2, 4}
        // arr4 = { 1, 2, 4}

        System.out.println("Extra 1:");
        System.out.println("Arr3 2nd index: "+arr3[2]);
        System.out.println("Arr4 2nd index: "+arr4[2]);

        System.out.println(arr3 == arr4); // True cause compares memory address
        System.out.println(arr3.equals(arr4)); // True cause compares memory address

        // Deep Comparison ArrayList aList1.equals(aList2)
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
        aList1.add(1);
        aList1.add(2);

        ArrayList<Integer> aList2 = new ArrayList<Integer>();
        aList2.add(1);
        aList2.add(2);
        System.out.println(aList1 == aList2); // false checks mem address
        System.out.println(aList1.equals(aList2)); // True checks values

        // Deep comparison String
        //
        String str1 = "Rakib";
        String str2 = str1;
        System.out.println(str1 + " " + str2);
        System.out.println(str1 == str2); // True
        System.out.println(str1.equals(str2)); // True
        str2 = "Rakibb";
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // false
        String str3 = "Rakibb";
        System.out.println(str3 == str2); // true -> Cause "Rakibb" value both same in str2 and str3
                                          // So to optimize memory str2 and str3 is in same heap mem location
        System.out.println(str3.equals(str2)); // true

    }
}
