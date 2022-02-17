// Abstraction class is 0 - 100% data hideable
// Interface is 100% data hide able by default
// Abstraction, Interface usually used in inheritance

public class Abstraction {
    public static void main(String[] args) {
        mainAbstractClass mainAbstractClass = new extendedAbstructClass();
        mainAbstractClass.message();
    }
    }

abstract class mainAbstractClass {
    abstract public void message();
}

class extendedAbstructClass extends mainAbstractClass {
    @Override
    public void message()
    {
        System.out.println("Yoo this is abstract class message");
    }
}

