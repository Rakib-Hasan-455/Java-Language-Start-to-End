package Consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "99999");

        // Normal java function
        greetCustomer(maria);

        // Consumer function
        greetCustomerConsumer.accept(maria);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " \nRegistration successful!");
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " \nRegistration successful!");

    static class Customer {
        String customerName, customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


}

