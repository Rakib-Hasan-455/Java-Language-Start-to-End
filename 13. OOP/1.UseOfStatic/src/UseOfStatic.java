// Static is an non acess modifier
// Static can be used on inner class, method, variable and static block
// Static let anything belongs to class
// Global Static variable memory location is always at the same location
// You can access static variable or method from another class by creating object.
// You have to access through class.variable/method

public class UseOfStatic
{
    public UseOfStatic()
    {
        
    }
    
    public static class MyWorld
    {
        
    }
    
    private static int x = 10;
    
    static 
    {
       System.out.println("Hello World"); 
    }
    
    public static void hello()
    {
        System.out.println(x);
    }
    
    public static void main(String[] args) 
    {
        UseOfStatic abc = new UseOfStatic();
        UseOfStatic xyz = new UseOfStatic();
        
        hello();
        
        abc.x = 12;
        System.out.println(abc.x);
        System.out.println(xyz.x);
        abc.hello();
        xyz.hello();

        UseOfStatic.x = 13;
        System.out.println(abc.x);
        System.out.println();

        StaticMemberClass asa = new StaticMemberClass();

        System.out.println(asa.z);
        asa.z = 122;
        System.out.println(asa.z);

        System.out.println(asa.abc);
        asa.xyz();
        System.out.println();
        System.out.println(StaticMemberClass.z);
       // System.out.println(StaticMemberClass.abc); //U can't do that cause abc is not static
        StaticMemberClass.xyz();

    }    
}