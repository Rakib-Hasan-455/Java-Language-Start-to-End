package Consumer;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");

        // Normal java function
        greetCustomer2Param(maria, true);

        // Consumer function
        greetCustomerBiConsumer.accept(maria, false);
    }

    private static void greetCustomer2Param(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));
    }


    private static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));

    private static class Customer {
        String customerName, customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}




