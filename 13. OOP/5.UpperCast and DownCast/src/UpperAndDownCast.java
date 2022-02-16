// Child Class inherits all properties of Parent Class
// We can keep child class object into parent class object by type cast the object -> (Parent) new child();
// But we can't keep parent class object into child class by type cast directly -> (Child) new parent();
// We can cast through the parent class object reference that is already created in the heap -> (Child) parent; //parent is the already created object
public class UpperAndDownCast {
    public static void main(String[] args) {

        // Uppercast -> Child into Parent Class
        Parent parent = (Parent) new Child(); // Valid

        // Downcast -> Parent into Child Class
        Child child = (Child) new Parent(); // Invalid -> It will throw class cast exception
        // As new Parent() is not instance of Child class so we can't cast it as (new Parent()) will be created in heap memory instantly at runtime.
                // So Child class can't refer to this memory and cast it

        Child child1 = (Child) parent; // Valid -> It will type cast validly.
        // The fact is that parent class is already in the heap memory and it can be downcast to Child class
    }
}

class Parent {
// can be anything doesn't matter for my notes
}

class Child extends Parent{
// can be anything doesn't matter for my notes
}
