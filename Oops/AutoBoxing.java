package Oops;
import java.util.*;

public class AutoBoxing{
    //record used 
    record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public AutoBoxing(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }
    public static void main(String[] args) throws Exception {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

    }
}
