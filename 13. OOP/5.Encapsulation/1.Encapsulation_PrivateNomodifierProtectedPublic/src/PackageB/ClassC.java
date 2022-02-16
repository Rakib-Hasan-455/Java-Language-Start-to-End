package PackageB;
import PackageA.*;

public class ClassC extends ClassA{

    public void showC(){
//        System.out.println(w); //Non-acessable from same/different package subclass as w is private modifier
//        System.out.println(x); //Non-acessable from different package subclass as x is non modifier
        System.out.println(y);
        System.out.println(z);
    }
}
