//Method overloading is same function/method name with different combination of data type parameter

public class MethodOverloadingMain extends OverRideClass{

@Override //here you can use this annotation or not it doesn't matter but it's good to use if there is same method is in the extended class
    public void display(){
        System.out.println("Method overloading with no parameter");
    }

    public void display(int x){
        System.out.println("Method overloading with 1 param");
    }

    public void display(int x, String y){
        System.out.println("Method overloading with 2 param");
    }

    public void display(String y, int x){
        System.out.println("Method overloading with 2 param with combination");
    }

    public static void main(String[] args) {
        MethodOverloadingMain xyz = new MethodOverloadingMain();
        xyz.display();
        xyz.display(5);
        xyz.display(5,"Rakib");
        xyz.display("hasan", 3);
    }
}
