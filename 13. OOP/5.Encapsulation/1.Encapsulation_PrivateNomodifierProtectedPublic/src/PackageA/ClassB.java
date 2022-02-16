package PackageA;

public class ClassB extends ClassA{

    public void showB()
    {
        //System.out.println(w); //Non-acessable from same/different package subclass as w private
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        ClassB xyz = new ClassB();

        xyz.showA();
    }

}
