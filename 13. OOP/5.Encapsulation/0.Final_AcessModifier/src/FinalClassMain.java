//Final keyword is non-access modifier
//final can be used before variable, class, and method.
//Final makes, variable as unchangeable constant, cant inherit class,  not overrideable method

public final class FinalClassMain { // class can't be inherited
    private final int x = 20; // variable cant be modified

    public final void show() // method can't be over loaded
    {
        System.out.println("Displaying final show");
    }

    public static void main(String[] args) {
        System.out.println("Test");
        FinalClassMain xyz = new FinalClassMain();
        xyz.show();
    }
}
