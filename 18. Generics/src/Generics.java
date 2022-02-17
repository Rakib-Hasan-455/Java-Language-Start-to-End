import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        // --> String, Integer are generics

        CustomGenerics<Integer, String> customGenerics = new CustomGenerics<>();
        // --> Yeah generics are like this

        CustomGenerics<?, ?> customGenerics1 = new CustomGenerics<>();
        // here ? can have any types of object

        
        // Wild Card
        ArrayList<testObj> list1 = new ArrayList<testObj>();

        list1.add(new testObj());
        list1.add(new testObj());

        ArrayList<testObj2> list2 = new ArrayList<testObj2>();

        list2.add(new testObj2());
        list2.add(new testObj2());

        showList(list2);
        showList2(list1);

        // best wildcard to use
        showList3(list1);
    }

    public static void showList(ArrayList<? extends testObj2> list) {
        for (testObj2 value : list) {
            System.out.println(value);
        }

    }

    public static void showList2(ArrayList<? super testObj> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }

    }

    static class testObj {
        testObj() {
            System.out.println("Yo wildcard");
        }
    }

    static class testObj2 {
        testObj2() {
            System.out.println("It's test obj 2");
        }
    }


    static class CustomGenerics<T1Obj, T2Obj> {
        T1Obj object1; // T1 type object is created
        T2Obj object2; // T2 type object is created

        public CustomGenerics() {

        }

        public CustomGenerics(T1Obj object1, T2Obj object2) {
            this.object1 = object1;
            this.object2 = object2;
        }


        public T1Obj getObject1() {
            return object1;
        }

        public void setObject1(T1Obj object1) {
            this.object1 = object1;
        }

        public T2Obj getObject2() {
            return object2;
        }

        public void setObject2(T2Obj object2) {
            this.object2 = object2;
        }
    }
}
