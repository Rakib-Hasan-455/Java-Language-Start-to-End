package PackageB;
import PackageA.*;

public class ClassD {

    public void showD(){
        ClassA xyz = new ClassA();
//        System.out.println(xyz.w); //Non-acessable from same/different package non subclass as w is private modifier data type
//        System.out.println(xyz.x); //Non-acessable from different package non subclass as x is non modifier data type
//        System.out.println(xyz.y); //Non-accessable from different package non subclass as y is protected modifier data type
        System.out.println(xyz.z);
    }

}
